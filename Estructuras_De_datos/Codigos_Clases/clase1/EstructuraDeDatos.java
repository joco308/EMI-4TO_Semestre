public class EstructuraDeDatos
{
    private int var1;
    long var2;
    short var3;
    float var4;
    double var5;
    char var6;
    String var7;
    EstructuraDeDatos()
    {
        var1 = 5;
        var2 = 4000;
        var3 = 30000;
        var4 = 3.14f;
        var5 = 12.5;
        var6 = 'z';
        var7 = "Hola ing"; 
    }

    void max_min_short()
    {
        System.out.println("El valor maximo de short es: " + Short.MAX_VALUE);
        System.out.println("El valor minimo de short es: " + Short.MIN_VALUE);
    }

    void max_min_int()
    {
        System.out.println("El valor maximo de int es: " + Integer.MAX_VALUE);
        System.out.println("El valor minimo de int es: " + Integer.MIN_VALUE);
    }

    void max_min_long()
    {
        System.out.println("El valor maximo de long es: " + Long.MAX_VALUE);
        System.out.println("El valor minimo de long es: " + Long.MIN_VALUE);
    }
    
    void max_min_float()
    {
        System.out.println("El valor maximo de float es: " + Float.MAX_VALUE);
        System.out.println("El valor minimo de float es: " + Float.MIN_VALUE);
    }

    void max_min_double()
    {
        System.out.println("El valor maximo de double es: " + Double.MAX_VALUE);
        System.out.println("El valor minimo de double es: " + Double.MIN_VALUE);
    }

    public void mostrar()
    {
        System.out.println(var1);
    }

    public void setVar1(int a)
    {
        var1 = a;
    }

    public int getVar1()
    {
        return var1;
    }
}

