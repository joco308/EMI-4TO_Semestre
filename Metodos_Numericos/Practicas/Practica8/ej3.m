clc, clear all, close all;

x = [0.0054,0.0118,0.0142,0.0236,0.0275,0.0364,0.0348,0.0405,0.0447,0.0577];
y = [10,20,30,40,50,60,70,80,90,100];
w = log(y);
u = log(x);
n=size(x,2);
A=[n,sum(u);sum(u),sum(u.^2)];
B=[sum(w);sum(u.*w)];
X = inv(A)*B;
a_0 = X(1);
a_1 = X(2);
alpha = exp(a_0);
beta=a_1;
w_cal = inline("a_0+a_1*x");
y_cal = inline("alpha*x.^beta");
s_r = sum((y-y_cal(alpha,beta,x)).^2);
s_t = sum((mean(y)-y_cal(alpha,beta,x)).^2);
R_2 = 1-s_r/s_t;
fprintf('                                     REGRESION EXPONENCIAL\n')
fprintf('Datos: \n')
fprintf('Elongaciones :')
fprintf('    %.4f',x)
fprintf('\nFuerza :')
fprintf('         %.0f',y)
fprintf('\nRESULTADOS:\n')
fprintf('\t\t F = alpha*x^beta_1\n')
fprintf('\t\t F = %.4f*x^%.4f\n',[alpha beta])
fprintf("DONDE:\n\tF = Fuerza\n\tx = elongaciones\n")
fprintf('El coeficiente de determinacion es :\n');
fprintf('\t\tR_2 = %.4f \n',R_2);
fprintf("Rigidez del resorte:\t%.4f\n",alpha)

figure(1)
hold on
plot(u,w,"* w")
k = min(u)-0.5:1:max(u)+1;
plot(k,w_cal(a_0,a_1,k),"-r")
xlabel("u = ln(elongacion)")
ylabel("w = ln(fuerza)")
title("w vs u");
legend('Puntos Transformados','Regresion Lineal')
text(5,2,"w = 7.5247 + 1.0006*u")
%axis([min(u)-1 max(u)+1 min(w)-1 max(w)+1])

figure(2)
hold on
j = min(x)-1:0.5:max(x)+1;
plot(x,y,"*w")
plot(x,y_cal(alpha,beta,x),"-r")
xlabel("x")
ylabel("F")
title("F vs x");
legend('Puntos Experimentales','Regresion Exponencial');
text(0.03,20,"F = 1853.1927*x^1^.^0^0^0^6")

%axis([min(x)-1 max(x)+1 min(y)-1 max(y)+1])
