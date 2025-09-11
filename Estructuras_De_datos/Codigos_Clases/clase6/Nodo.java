public class Nodo {
    int date;
    public Nodo ptrAnterior;
    public Nodo ptrSiguiente;

    public Nodo(int date){
        this.date=date;
        this.ptrAnterior = null;
        this.ptrSiguiente = null;
    }
}