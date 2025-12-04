clc, clear all, close all;

y = [10,15,20,25,30,35,40,45,50,55,60];
x = [1.3897,1.8036,1.9891,2.1903,2.6036,2.7222,2.9073,2.9575,3.2372,3.2949,3.2943];
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
fprintf('Tiempo :')
fprintf('      %.0f',x)
fprintf('\nAltura :')
fprintf('  %.4f',y)
fprintf('\nRESULTADOS:\n')
fprintf('\t\t h = alpha*t^beta_1\n')
fprintf('\t\t h = %.4f*t^%.4f\n',[alpha beta])
fprintf("DONDE:\n\th = altura en cm\n\tt = tiempo\n")
fprintf('El coeficiente de determinacion es :\n');
fprintf('\t\tR_2 = %.4f (Ajuste Bueno)\n',R_2);
fprintf("Gravedad:\t%.4f\n",alpha*2)

figure(1)
hold on
plot(u,w,"* w")
k = min(u)-0.5:1:max(u)+1;
plot(k,w_cal(a_0,a_1,k),"-r")
xlabel("u = ln(tiempo)")
ylabel("w = ln(altura)")
title("w vs u");
legend('Puntos Transformados','Regresion Lineal')
text(1,2,"w = 1.5932 + 2.0046*u")
axis([min(u)-1 max(u)+1 min(w)-1 max(w)+1])

figure(2)
hold on
j = -5:0.5:10;
plot(x,y,"*w")
plot(x,y_cal(alpha,x,beta),"-r")
xlabel("t")
ylabel("h")
title("h vs t");
legend('Puntos Experimentales','Regresion Exponencial');
text(2,15,"h = 4.9197*t^2^.^0^0^4^6")
axis([min(x)-1 max(x)+1 min(y)-1 max(y)+1])
