# Modelo de referencia OSI y TCP/IP
Para mandar datos por la red necesitas normal y reglas a eso se l llama PROTOCOLO la manera de como se mandan los datos.
Todas las tarjetas de red tienen:
- Direccion MAC (Fundamental en LAN, formato hexadesimal)
- Direeccion IP (Tiene 32 bits, se divide por 4 octetos,pueden ser estaticas o dinamicas)

## OSI
### Forma que ciajan los datos
Un paquete tiene una unidad de informacion logicamente y tiene informacion del origen y el destino
#### Protocolo
Detecta la conecccion fisica (claveado o no)

El modelo de OSI tiene 7 capas:
1. Fisico
2. Enlace de datos
3. Red 
4. Trasporte
5. Secion
6. Presentacion
7. Aplicacion

## Puertos
Todos los puetos todos tiene 65536 puertos cada pueto sirve para algo 

### Puertos fisicos
Puertos UVA HDMI Displey port etc, en red puerto fibra optica etc

### Puertos logicos
el rango de puertos logicos tiene 2 bytes puertos 
- Los 0 al 1023 estan reservados para puertos sistema
- Los puertos 1024 al 49151 son puertos de usuario
- Los puertos de 49 al 65535 llmados puertos dinamicos o privados



" la papa de trasnporte agrega una encabezado (pueto destipo puerto origen) en la capa de red le agregan (ip destino ip oriigen)  en la capa enlace de datos agrega (MAc origen o MAc destino) "

## TCP/IP
Tiene  4 capas
- Aplicacion
- Trasporte
- Internet 
- Acceso a la red

### TCP
Orientado a la coneccion hay un intercambio de datos inicial (three-wey-handshake) asegura la entrega espera a que todos los paquetes lleguen, si uno falta no se puede establecer para hacer eso utilizan numeros de secuencia.
### UDP
No erientado a la conexcion no hay un intecambio de datos inicial no hace nada que el TCP hace no corrige errores no utiliza retrasnmiciones lo bueno es que es rapipdo



UDP no asegura la entrega confiable


