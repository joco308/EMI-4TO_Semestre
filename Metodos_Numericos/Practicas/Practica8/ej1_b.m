clc, clear all, close all;

x=[1,2,3,4,5];
y=[0.5,1.7,3.4,5.7,8.4];

w = log(y);
n = size(w,2);
A= [n,sum(x);sum(x),sum(x.^2)];
B=[sum(w);sum(x.*w)];
X=inv(A)*B;
a_0 = X(1);
a_1 = X(2);
alpha = exp(a_0);
beta = a_1;
w_cal = inline("a_0+a_1*x");
y_cal = inline("alpha*exp(beta*x)");
s_r = sum((y-y_cal(alpha,beta,x)).^2);
s_t = sum((mean(y)-y_cal(alpha,beta,x)).^2);
R_2 = 1-s_r/s_t;
fprintf('                                     REGRESION EXPONENCIAL\n')
fprintf('Datos: \n')
fprintf('X :')
fprintf('    %.0f',x)
fprintf('\nY :')
fprintf('    %.0f',y)
fprintf('\nRESULTADOS:\n')
fprintf('\t\t y = alpha*e^(beta*x)\n')
fprintf('\t\t y = %.4f*e^(%.4f*x)\n',[alpha beta])
fprintf('El coeficiente de determinacion es :\n');
fprintf('\t\tR_2 = %.4f (Ajuste Bueno)\n',R_2);

figure(1)
hold on
plot(x,w,"* w")
k = min(x)-1:1:max(x)+1;
plot(k,w_cal(a_0,a_1,k),"-r")
xlabel("u = x")
ylabel("w = ln(y)")
title("w vs x");
legend('Puntos Transformados','Regresion Lineal')
text(2,-0.5,"w = -1.0698 + 0.6853*x")

figure(2)
hold on
j = min(x)-1:1:max(x)+1;
plot(x,y,"*w")
plot(x,y_cal(alpha,beta,x),"-r")
xlabel("x")
ylabel("y")
title("y vs x");
legend('Puntos Experimentales','Regresion Exponencial');
text(2,1,"y = 0.3431*e^0^.^6^8^5^3^*^x")

