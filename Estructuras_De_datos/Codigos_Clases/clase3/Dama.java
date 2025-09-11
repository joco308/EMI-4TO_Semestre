package Estructuras_De_datos.Codigos_Clases.clase3;

class tools
{
    public static int min(int n1, int n2)
    {
        if(n1>n2){
            return n1;
        }
        else
        {
            return n2;
        }
    }
}

public class Dama extends Pieza
{
    Dama(String name, String color)
    {
        super(name, color, 0, 0);
    }

    public void mover(int posc, int pose,int poscP, int poseP) {
        if(Math.abs(poscP-this.mostrar()[0]) == Math.abs(poseP-this.mostrar()[1])){
            super.mover(poscP, poseP);
        }
        else if (poscP == this.mostrar()[0] || poseP == this.mostrar()[1])
        {
            super.mover(poscP, poseP);
        }
        else
        {
            int h = Math.abs(poscP-this.mostrar()[0]);
            int a = Math.abs(poseP-this.mostrar()[1]);
            int move = tools.min(h, a);
            if(this.mostrar()[1]<poseP && this.mostrar()[0]<poscP)
            {
                super.mover(this.mostrar()[0]+move, this.mostrar()[1]+move);
            }
            else if(this.mostrar()[1]>poseP && this.mostrar()[0]<poscP)
            {
                super.mover(this.mostrar()[0]+move, this.mostrar()[1]-move);
            }
            else if(this.mostrar()[1]<poseP && this.mostrar()[0]>poscP)
            {
                super.mover(this.mostrar()[0]-move, this.mostrar()[1]+move);
            }
            else if(this.mostrar()[1]>poseP && this.mostrar()[0]>poscP)
            {
                super.mover(this.mostrar()[0]-move, this.mostrar()[1]-move);
            }
            
        }
    }
    
}