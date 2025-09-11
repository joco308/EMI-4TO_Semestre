package Estructuras_De_datos.Codigos_Clases.clase3;
import java.util.Random;

public class Peon extends Pieza
{
    Random rand = new Random();
    int blindaje;
    boolean primerMovimiento = true;
    //private int posC_F;

    Peon(String nombre, String color)
    {
        super(nombre, color,0,0);
        this.blindaje = rand.nextInt(4);
        int posc = rand.nextInt(8);
        int pose = rand.nextInt(7);
        this.mover(posc, pose);
        //this.posC_F = posC;
    }

    public void mover(int posc, int pose)
    {
        if(primerMovimiento)
        {
            super.mover(posc, pose+1);
            //this.posC_F = posc;
            this.primerMovimiento = false;
        }
        else
        {
            super.mover(posc, pose);
            //this.posC_F = posc;
        }
    }     
}