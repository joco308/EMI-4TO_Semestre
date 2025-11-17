clc, clear all, close all;
x = [6,7,11,15,17,21,23,29,29,37,39];
y = [29,21,29,14,21,15,7,7,13,0,3];
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
y_inv = inline("(y-a_0)/a_1","a_0","a_1","y");
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
fprintf('\ty = %.5f - %.5f*x\n\n', a_0, a_1*-1);
fprintf('Coeficiente de determinacion\tR^2 = %.5f\n', R_2);
fprintf('Coeficiente de correlacion\tR   = %.5f\n', R);
fprintf('=============================================\n');
fprintf("\nDatos calculados\n\tx = 10 -- y = %.5f\n\ty = 14 -- x = %.5f \n",y_cal(a_0,a_1,10),y_inv(a_0,a_1,14))
fprintf('=============================================\n');

u=min(x)-1:1:max(x)+1;
plot(x,y,"*r")
hold on
plot(u,y_cal(a_0,a_1,u),"w-")
legend('Puntos experimentales','Regresión Lineal')
title("Y vs X")
xlabel("X")
ylabel("Y")
axis([min(x)-1 max(x)+1 min(y)-1 max(y)+1])
