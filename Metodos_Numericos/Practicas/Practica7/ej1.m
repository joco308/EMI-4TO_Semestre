clc, clear all, close all;
x = [0, 2, 4, 6, 9, 11, 12, 15, 17, 19];
y = [5, 6, 7, 6, 9, 8, 7, 10, 12, 12];
n=size(x,2);
A_inv=inv([n,sum(x);sum(x),sum(x.^2)]);
B=[sum(y);sum(x.*y)];
X=A_inv*B;
a_0=X(1);
a_1=X(2);
y_cal = inline("a_0+a_1*x");
S_r=sum((y-y_cal(a_0,a_1,x)).^2);
S_t=sum((y-mean(y)).^2);
R_2 = (S_t-S_r)/S_t;
R = R_2^0.5;
fprintf('=============================================\n');
fprintf('           REGRESIÓN LINEAL\n');
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
fprintf('\ty = %.4f + %.4f*x\n\n', a_0, a_1);
fprintf('Coeficiente de determinacion\tR^2 = %.4f\n', R_2);
fprintf('Coeficiente de correlacion\tR   = %.4f\n', R);
fprintf('=============================================\n');
fprintf("\nDatos calculados\n\tx = 3 -- y = %.4f\n\tx = 14 -- y = %.4f \n",y_cal(a_0,a_1,3),y_cal(a_0,a_1,14))
fprintf('=============================================\n');

u=min(x)-1:1:max(x)+1;
plot(x,y,"*r")
hold on
plot(u,y_cal(a_0,a_1,u),"w-")
legend('Puntos experimentales','Regresión Lineal')
title("Y vs X")
xlabel("X")
ylabel("Y")
axis([min(x)-1 max(x)+1 y_cal(a_0,a_1,min(x)-1) max(y)+1])
