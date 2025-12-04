clc, clear all, close all;

y_exacta = @(x) 3^(1/3)*(x.^2 + x + 3).^(1/3);
h=0.05;
x = 2:h:3;
f = @(y,x) (1+2*x)./y^2;
n = size(x,2);
x_0 = 2;
y_0 = 3;
y = zeros(1,n);
y(1) = y_0;
fprintf('***************************************REPORTE***************************************\n')
fprintf('\t                            SOLUCION POR RK-2\n')
fprintf('Datos: \n')
fprintf('\tEcuacion Diferencial: y` = (1+2*x)/y^2\n')
fprintf('\tCondicion inicial   : y(%.0f) = %.0f\n',[x_0 y_0])
fprintf('\tFuncion             : f(x,y) = (1+2*x)/y^2')
fprintf('\tPaso                : h = %.1f\n',h)
fprintf('\tIntervalo           : 2 <= x <= 3\n')
fprintf('Tabla de iteraciones: \n')
fprintf('---------------------------------------------------------------------------------------------\n')
fprintf('\titer            x_i             y_i             y_exacta        E_t             e_t\n')
fprintf('---------------------------------------------------------------------------------------------\n')
for i = 1:n
    k = h*f(y(i),x(i));
    k_2 = h*f(y(i)+(1/2)*k,x(i)+(1/2)*h);
    k_3 = h*f(y(i)-k+2*k_2,x(i)+h);
    E_t = abs(y_exacta(x(i))-y(i));
    e_t = abs((y_exacta(x(i))-y(i))/y_exacta(x(i)));
    fprintf('\t%.0f\t       \t%.4f\t     \t%.4f\t      \t%.4f\t     \t%.4f\t      \t%.2f\t\n',[i-1 x(i) y(i) y_exacta(x(i)) E_t e_t])
    y(i+1) = y(i)+(1/6)*(k+4*k_2+k_3);
end
y(n+1)=[];
fprintf('---------------------------------------------------------------------------------------------\n')

plot(x,y_exacta(x),"*r");
hold on 
plot(x,y,"-w")
legend("Funcion exaacta","Funcion aproximada")
title('y vs x'); xlabel('eje de las abscisas'); ylabel('eje de las ordenadas');

