clc, clear all, close all;
x= [0.75,2,3,4,6,8,8.5];
y= [1.2,1.95,2,2.4,2.4,2.7,2.6];
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
fprintf('\ty = %.5f + %.5f*x + %.5f*x^2\n\n', a_0, a_1,a_2);
fprintf('Coeficiente de determinacion\tR^2 = %.5f\n', R_2);
fprintf('Coeficiente de correlacion\tR   = %.5f\n', R);
fprintf('=============================================\n');
fprintf("\nDatos calculados\n\tx = 2 -- y = %.5f\n",y_cal(a_0,a_1,a_2,2))
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
