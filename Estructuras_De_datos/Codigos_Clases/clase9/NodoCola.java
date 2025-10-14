public class NodoCola
{
    Nodo dato;
    NodoCola sig,ant;

    NodoCola(Nodo d)
    {
        this.dato = d;
        this.ant = null;
        this.sig = null;
    }

    public void mostrar()
    {
        System.out.println("==============================");
        System.out.println("Puntero anterior: "+this.ant);
        System.out.println("Dato: ");
        this.dato.mostrar();
        System.out.println("Puntero siguiente: "+this.sig);
        System.out.println("==============================");
    }
}