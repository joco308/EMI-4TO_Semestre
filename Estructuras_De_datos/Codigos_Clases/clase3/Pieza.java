package Estructuras_De_datos.Codigos_Clases.clase3;

public class Pieza 
{
    String nombre;
    String color;
    private int posC;
    private int posE;

    Pieza(String nombre, String color, int posc, int pose)
    {
        this.nombre = nombre;
        this.color = color;
        this.posC = posc;
        this.posE = pose;
    }

    public void mover(int posc, int pose)
    {
        this.posC = posc;
        this.posE = pose;
    } 

    public int[] mostrar()
    {
        return new int[]{posC,posE};
    }   
}