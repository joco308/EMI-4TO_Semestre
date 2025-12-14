# VLAN
Una **VLAN** (Virtual LAN) permite dividir el tráfico de manera lógica, mejorando la seguridad y el rendimiento de la red. Cada VLAN funciona dentro de un **switch** como un dominio de difusión independiente. Para que las VLAN puedan comunicarse a través de un **router**, se crean **subinterfaces**.

### Beneficios de las VLAN
- Seguridad mejorada
- Reducción de costos
- Mejor rendimiento de la red
- Dominios de difusión independientes
- Eficiencia de TI
- Eficiencia administrativa
- Administración de proyectos y aplicaciones más simple

## Tipos de VLAN
- **VLAN predeterminada**: VLAN por defecto en todos los switches (normalmente VLAN 1).
- **VLAN nativa**: VLAN que no se etiqueta en un enlace troncal.
- **VLAN de administración**: VLAN usada para acceder y administrar el switch remotamente.

## Comandos útiles
- `show vlan brief`: muestra todas las VLAN configuradas en un switch.
- `no vlan N`: elimina la VLAN N (no se pueden eliminar las VLAN nativas, que normalmente son 5).

### Tráfico de voz
- Para redes con **telefonía IP**, la latencia máxima recomendada es **150 ms**.
- Se puede crear una VLAN específica para el tráfico de voz, separando los datos de PC y voz.

## Enlaces troncales (trunk)
Un **enlace troncal** permite transportar el tráfico de múltiples VLAN a través de una sola interfaz, sin importar la VLAN de origen.
- **Encapsular**: método para incluir información de VLAN en el paquete.
- **Etiquetar**: se marca el paquete con la VLAN correspondiente para identificar su origen al pasar por el troncal.

## Asignación de puertos a VLAN
```
interface <interface_id>
switchport mode access
switchport access vlan <vlan_id>
```
- Un puerto puede estar en **mode access** (solo pasa tráfico de la VLAN asignada) o **trunk** (pasa tráfico de todas las VLAN).
- La configuración se guarda en `flash:vlan.dat`.

