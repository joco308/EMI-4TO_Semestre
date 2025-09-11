# Ejercicios
Hallar el segmento de red y ver que direccion es:
### 1.-
#### 90.0.200.0/19
Pasos:  
1. Mascara 19 255.255.224.0
2. Octeto de tranajo el segundo
3. Restar $224-256=32$
4. Dividir $200/32=6$
5. Multiplicar $6*256=1536$
6. Direcion Red 90.0.192.0
7. Direccion Blortcast 90.0.223.255

### Es una Direccion Host

#### Clase A 1.0.0.0 - 126.255.255.255
#### Clase B 128 - 192.255.255.255
#### Clase C 192.0.0.0 - 223.255.255.255

* Estas se clasifican en privadas y publicas

## Direciones de enlace local
Aparecen cuando no se pudo optener una direcion ip del ruter
 
# Asignasion de ip
la IANA asigna un bloque de direcciones ip a lugares del mundo

## ISP (Internet services probailbe)
El probedor de servicios de intenet el que te asigna un ip publica a tu ruter

# IPv6
Crear mas ip en el caso de que se acaben que de echo esta pasando 
tiene 128 bits de transmicion para mejorar las capacidades de direccionamiento y mecansmo de seguridad
se expresa en formato exadecimal

## ICMP 
protocolo mensajeria para el conjunto de aplicaciones TCP/IP proporciona enajes de importancia y algunos datos

# Ejercicios:

### Dada la red 10.10.0.0/21 hallar el host 1999 de la red 20

$255.255.248.0$  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$-256$  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$8$  
$8*19=152$  
$10.10.168.0$ -> Red 21
#### Hallar el host 1999

$1999/256 = 7$ y residuo 207

**$10.10.159.207$**

### Dada la red 10.0.0.0/10 hallar la el host 2578981 de la red 3

$255.192.0.0$  
&nbsp;&nbsp;&nbsp;&nbsp;$-256$  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$64$

$64*(3-1)=128$

$2573981/256=10054$ residuo $157$  
Seguir dividiendo 157 al 4to octeto
$10054/256=39$ residuo $70$
70 al 2do y 39 al 3er octetos

### $10.167.70.157$

