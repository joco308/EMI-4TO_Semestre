clc, clear all;

%Datos
A=[-3,5,2;
    -1,-2,3;
    9,-15,-6];
B=[7;
    -4;
    0];
if(det(A)==0)
    fprintf("El sistema no tiene una única solución .\n")
    return;
end

AU = [A,B];

n = size(AU,1);

for(i = 1:n)
    AU(i,:)=(1/AU(i,i))*AU(i,:);
    for(j=1:n)
        if(j~=i)
            AU(j,:)=-AU(j,i)*AU(i,:)+AU(j,:);
        end
    end
end

x=AU(:,n+1);
fprintf("\t\tMETODO GAUSS JORDAN\n")
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


