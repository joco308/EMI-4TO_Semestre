public class Nodo
{
    Integer dateInt = null;    
    Double dateDouble = null;  
    Short dateShort = null;    
    Float dateFloat = null;    
    Long dateLong = null;      
    Nodo ptr = null; 
    Nodo(int value)
    {
        this.dateInt = value;
    }

    Nodo(long value)
    {
        this.dateLong = value;
    }

    Nodo(float value)
    {
        this.dateFloat = value;
    }

    Nodo(double value)
    {
        this.dateDouble = value;
    }

    Nodo(short value)
    {
        this.dateShort = value;
    }

}