# Modelo de referencia OSI y TCP/IP
Para mandar datos por la red se necesitan normas y reglas; a esto se le llama **PROTOCOLO**, que define la manera en que se envían y reciben los datos.

Todas las tarjetas de red tienen:
- **Dirección MAC** (fundamental en LAN, formato hexadecimal de 48 bits, única por fabricante)
- **Dirección IP** (IPv4 tiene 32 bits, se divide en 4 octetos; puede ser estática o dinámica mediante DHCP)

## OSI
### Forma en que viajan los datos
Un **paquete** es una unidad de información lógica que contiene datos y encabezados con información del **origen** y el **destino**.

#### Protocolo
Define cómo se establece la comunicación, el formato de los datos y cómo se detectan y corrigen errores. La detección de conexión física (cableado o no) corresponde a capas inferiores.

El modelo **OSI** tiene **7 capas**:
1. **Físico**: transmisión de bits (medios, voltajes, conectores, velocidades).
2. **Enlace de datos**: tramas, direcciones MAC, detección de errores (Ethernet, ARP).
3. **Red**: direccionamiento lógico y enrutamiento (IP, ICMP).
4. **Transporte**: comunicación extremo a extremo, control de flujo y errores (TCP, UDP).
5. **Sesión**: establecimiento, mantenimiento y cierre de sesiones.
6. **Presentación**: formato de datos, codificación, compresión y cifrado (TLS/SSL).
7. **Aplicación**: servicios al usuario final (HTTP, FTP, SMTP, DNS).

## Puertos
Todos los hosts tienen **65536 puertos lógicos** (0–65535). Cada puerto identifica un servicio o proceso.

### Puertos físicos
Puertos de hardware: USB, HDMI, DisplayPort; en red: RJ‑45 (Ethernet), fibra óptica, etc.

### Puertos lógicos
El rango de puertos lógicos usa **16 bits (2 bytes)**:
- **0–1023**: puertos bien conocidos o del sistema (HTTP 80, HTTPS 443, SSH 22).
- **1024–49151**: puertos registrados (aplicaciones de usuario).
- **49152–65535**: puertos dinámicos o efímeros (asignados temporalmente por el SO).

> En la **capa de transporte** se agrega un encabezado con **puerto origen** y **puerto destino**.  
> En la **capa de red** se agrega **IP origen** e **IP destino**.  
> En la **capa de enlace de datos** se agrega **MAC origen** y **MAC destino**.

## TCP/IP
Tiene **4 capas**:
- **Aplicación** (equivale a aplicación, presentación y sesión del OSI)
- **Transporte**
- **Internet**
- **Acceso a la red** (enlace de datos + físico)

### TCP
Orientado a la conexión. Usa el **three‑way handshake** (SYN, SYN‑ACK, ACK). Asegura entrega confiable, ordenada y sin duplicados mediante **números de secuencia**, **ACK**, **control de flujo** y **retransmisiones**. Usado por HTTP/HTTPS, FTP, SMTP.

### UDP
No orientado a la conexión. No hay handshake inicial. No garantiza entrega, orden ni corrección de errores. Es rápido y con baja latencia. Usado por DNS, streaming, VoIP y juegos en línea.

UDP **no asegura** la entrega confiable.

### Datos de importancia crucial
- **ARP** resuelve IP → MAC dentro de la LAN.
- **ICMP** se usa para diagnóstico (ping, traceroute).
- **NAT** traduce direcciones privadas a públicas.
- **DNS** traduce nombres de dominio a direcciones IP.
- **DHCP** asigna IP automáticamente.
- **MTU** define el tamaño máximo de trama; si se excede, ocurre fragmentación.

