# SQL
Structured Query Language, (lenguaje de consultas estructuradas) tiene 3 sub lenguajes de consulta:
* LDD/DDL 
* DML/DML 
* LCD/DCL 

```sql
SELECT 
    CURTIME() AS 'CURTIME',
    NOW() AS 'NOW',
    DAYNAME(NOW()) AS 'DAY NAME',
    DAYOFMONTH(NOW()) AS 'DIA/MES',
    DAYOFWEEk(NOW()) AS 'DIA/SEMANA',
    DAYOFYEAR(NOW()) AS 'DIA/AÑO'
    MONTH(NOW()) AS 'MES/AÑO',
    YEAR(NOW()) AS 'AÑO',
    DAYNAME('1900-01-01') as 'DAY';
```

## Ejemplares
Un momento en el tiempo se describe medianre un ejemplar en la base de datos son datos en un punto del tiempo LMD

## Esquema 
describe la base de datos de forma estatica y con poca o nula variacion LDD

La base de datos hacemos la estructura a nivel de esquema no cambia la estructura de la base de datos

