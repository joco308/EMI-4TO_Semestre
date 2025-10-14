import java.net.Socket;

public class Nodo
{
    String dato;
    Nodo pp,p1,p2,p3;

    Nodo(String d)
    {
        this.dato = d;
        this.p1=null;
        this.p2=null;
        this.p3=null;
        this.pp=null;
    }

    public void mostrar()
    {
        System.out.println("=================================");
        System.out.println("Puntero padre: "+this.pp);
        System.out.println("---------------------------");
        System.out.println("Dato: "+ this.dato);
        System.out.println("---------------------------");
        System.out.println("| p1: "+p1+" | p2: "+p2+" | p3: "+p3+" |");
        System.out.println("=================================");

    }
}