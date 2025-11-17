clc, clear all, close all;
x = [3,4,5,7,8,9,11,12];
y = [1.6,3.6,4.4,3.4,2.2,2.8,3.8,4.6];
n=size(x,2);
A_inv = inv([n,sum(x),sum(x.^2);sum(x),sum(x.^2),sum(x.^3);sum(x.^2),sum(x.^3),sum(x.^4)]);
B=[sum(y);sum(x.*y);sum((x.^2).*y)];
X=A_inv*B;
a_0=X(1);
a_1=X(2);
a_2=X(3);
y_cal= inline("a_0+a_1*x+a_2*x.^2","a_0","a_1","a_2","x");
S_t=sum((y-mean(y)).^2);
S_r=sum((y-y_cal(a_0,a_1,a_2,x)).^2);
R_2=(S_t-S_r)/S_t;
R=R_2^0.5;
fprintf('=============================================\n');
fprintf('           REGRESIÓN POLINOMIAL\n');
fprintf('=============================================\n\n');

fprintf('Datos:\n');
fprintf('x = [');
fprintf('%.0f ', x);
fprintf(']\n');
fprintf('y = [');
fprintf('%.0f ', y);
fprintf(']\n');

fprintf('=============================================\n');
fprintf('Ecuación de Regresión:\n');
fprintf('\ty = %.4f + %.4f*x + %.4f*x^2\n\n', a_0, a_1,a_2);
fprintf('Coeficiente de determinacion\tR^2 = %.4f\n', R_2);
fprintf('Coeficiente de correlacion\tR   = %.4f\n', R);
fprintf('=============================================\n');


u=min(x)-1:1:max(x)+1;
plot(x,y,"*r")
hold on
plot(u,y_cal(a_0,a_1,a_2,u),"w-")
legend('Puntos experimentales','Regresión Polinomial')
title("Y vs X")
xlabel("X")
ylabel("Y")
axis([min(x)-1 max(x)+1 min(y)-1 max(y)+1])
