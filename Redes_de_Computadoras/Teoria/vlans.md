# VLAN
Dividir el trafo logico, mayor seguridad, divide el trafico y separa las vlans, funcionan en lo switches, cada vlan es un dominio de difucion.  
en el ruter para que se puedan comunicar las VLAN se crean sub interfaces.  
**brotkas de difucion**
- seguridad mejorada
- reducion de costos
- mejor rendimiento 
- dominnios de difucion
- eficioencia de TI
- eficioncia administrativa
- administacio  de proyectos mas simple y aplicaciones  

## que vlan tenemos
- VLAN predeterminanda
- VLAN nativa
- VLAN de administacion

## show vlan brief
muestras las vlans de un switch
## no vlan 'N'
borra la vlan, no puedes borrar las nativas que son 5  

**trafivo de voz, pc con voz.  
la latencia en una red tiene que ser 150ms en voz**  

## enlaces troncales de VLAN
ees un enlace punto a punto que trasnporta datos de cualquier VLAN por una interface saca todo el trafico sin importar de que VLAN pertenesca  

**direfencia entre encapsular y etiquetar al configurar elruter**

# Asignacion de puertos a redes VLAN
interface **interface_id**
switchport mode access
switchport access vlan **vlan_id**

un pueto puede estar en mode access o en trunck que en acces solo pasa trafico de la vlan asignada y el trunk pasa cualquier trafico de cualquier vlan
la configuracion se guerda en **flash:vlan.dat**



