clc, clear all, close all;

x=[1,2,3,4,5];
y=[0.5,1.7,3.4,5.7,8.4];
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
s_r = sum((y-y_cal(alpha,x,beta)).^2);
s_t = sum((mean(y)-y_cal(alpha,x,beta)).^2);
R_2 = 1-s_r/s_t;
fprintf('                                     REGRESION EXPONENCIAL\n')
fprintf('Datos: \n')
fprintf('X      :')
fprintf('    %.0f',x)
fprintf('\nY :')
fprintf('   %.0f',y)
fprintf('\nRESULTADOS:\n')
fprintf('\t\t y = alpha*x^beta_1\n')
fprintf('\t\t y = %.4f*x^%.4f\n',[alpha beta])
fprintf('El coeficiente de determinacion es :\n');
fprintf('\t\tR_2 = %.4f (Ajuste Bueno)\n',R_2);

figure(1)
hold on
plot(u,w,"* w")
k = min(u)-1:1:max(u)+1;
plot(k,w_cal(a_0,a_1,k),"-r")
xlabel("u = ln(x)")
ylabel("w = ln(y)")
title("w vs u");
legend('Puntos Transformados','Regresion Lineal')
text(0,-2,"w = -0.6913 + 1.7517*u")

figure(2)
hold on
j = min(x)-1:1:max(x)+1;
plot(x,y,"*w")
plot(x,y_cal(alpha,x,beta),"-r")
xlabel("x")
ylabel("y")
title("y vs x");
legend('Puntos Experimentales','Regresion Exponencial');
text(2,1,"y = 0.5009*x^1^.^7^5^1^7")
