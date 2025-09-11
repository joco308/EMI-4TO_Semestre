# Sacar segmento de red

Tienes que restar la mascara de red con la ip

200.200.200.199 -> direcion IP red  
255.255.255.192 

restar el los primeros numeros despues de la parte de red

$199-192=64$

**64 IPs de host**

¿Cual de las siguientes direcciones se puede configurar?

a) 150.150.150.127/25  
b) 200.1.1.160/28  
c) 90.90.90.199/30  
<u>**d) 40.40.40.160/26**</U>

### Resolucion

<div aling="center">90.90.90.199/30 -> sacar eñ 199</div>  

<div aling="center">sin antes restar con su mascara de red</div>

<div aling="center">90.90.90.199  </div>

<div aling="center">255.255.255.192</div>

<div aling="center">*Restamos el ultimo octeto*</div>
$199-192=7$  
*Dividir 199 entre 7*  

$199/7=28 $  *solo nos importa la parte entera*  

<div aling="center">la ip va desde</div>

$28*7 = 196$

$196+(7-1)=202$








