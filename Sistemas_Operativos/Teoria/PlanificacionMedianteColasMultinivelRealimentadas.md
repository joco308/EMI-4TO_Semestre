# Planificacion mediante colas multinivel realimentadas
En este algoridmo se permite mover un proceso de una coa  otra  
La idea es esperar los procesos en funcion de las caracteriticas de sus rafagas de CPU  
Un proceso que este esperando demasiado tiempo en una cola de baja prioridad puede pasarse a una cola de prioridad mas alta. Se denomina "Mecanismo de envejecimiento"  
En general se define bajo a los siguientes parametos 
- El numero de volas
- El algoridmo de planificacion
- El metodo para pasar de una cola a otra  

