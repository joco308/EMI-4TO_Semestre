clc, clear all;

%Datos
A=[10,1,2,-1;
    -5,4,6,-1;
    0,-2,3,8;
    0,0,-5,5];
B=[-3;
    9;
    2;
    -1];
if(det(A)==0)
    fprintf("El sistema no tiene una única solución .\n")
    return;
end

AU = [A,B];

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
for(i = 1:size(AU,1))
    if(floor(size(AU,1)/2)==i)
        fprintf("AU=")
        fprintf("\t%3.3f",AU(i,:))
    else
        fprintf("\t%3.3f",AU(i,:))
    end
    fprintf("\n")
end

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
