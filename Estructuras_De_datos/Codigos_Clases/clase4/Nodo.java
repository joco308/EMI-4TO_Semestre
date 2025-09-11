public class Nodo
{
    int dato;
    Nodo ptr;
    
    public Nodo(int dato)
    {
        this.dato = dato;
        this.ptr = null;
    }

    public void mostrar()
    {
        System.out.println(this.dato);
        System.out.println(this.ptr);
    }
}