clc, clear all;
%Datos
A = [10,1,2;
    4,6,-1;
    -2,3,8];
B = [3;
    9;
    51];

if(det(A)==0)
    fprintf("No tiene solucion")
    return;
end
A_inv = inv(A);
x = A_inv*B;
fprintf("\t\tMETODO INVERSA\n")
fprintf("Datos:\n")
for(i = 1:size(A,1))
    if(floor(size(A,1)/2)==i)
        fprintf("A=     ")
        fprintf("\t%3.3f",A(i,:))
    else
        fprintf("\t%3.3f",A(i,:))
    end
    fprintf("\n")
end
fprintf("\n")
for(i = 1:size(B,1))
    if(floor(size(B,1)/2)==i)
        fprintf("B=     ")
        fprintf("\t%3.3f",B(i,:))
    else
        fprintf("\t%3.3f",B(i,:))
    end
    fprintf("\n")
end
fprintf("\n")
for(i = 1:size(A_inv,1))
    if(floor(size(A_inv,1)/2)==i)
        fprintf("A_inv=")
        fprintf("\t%3.3f",A_inv(i,:))
    else
        fprintf("\t%3.3f",A_inv(i,:))
    end
    fprintf("\n")
end
fprintf("\n")

fprintf("Resultado:\n")
for(i = 1:size(x,1))
    if(floor(size(x,1)/2)==i)
        fprintf("x=")
        fprintf("\t%3.3f",x(i,:))
    else
        fprintf("\t%3.3f",x(i,:))
    end
    fprintf("\n")
end

