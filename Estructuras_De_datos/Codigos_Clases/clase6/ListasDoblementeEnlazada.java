public class ListasDoblementeEnlazada {
    Nodo ptrInicial;
    Nodo ptrFinal;

    public ListasDoblementeEnlazada(int date){
        this.ptrInicial = new Nodo(date);
        this.ptrFinal = this.ptrInicial;
    }

    public void añadir(int date){
        Nodo node = new Nodo(date);
        this.ptrFinal.ptrSiguiente = node;
        node.ptrAnterior = this.ptrFinal;
        this.ptrFinal = node;
    }

    public void mostar_adelante_atras(){
        Nodo arr = this.ptrInicial;
        while (arr != null) {
            System.out.println(arr.date);
            arr = arr.ptrSiguiente;
        }
    }

    public void mostrar_atras_adelante(){
        Nodo arr = this.ptrFinal;
        while (arr!=null) {
            System.out.println(arr.date);
            arr = arr.ptrAnterior;            
        }
    }

    public void añadir_inicio(int date){
        Nodo node = new Nodo(date);
        this.ptrInicial.ptrAnterior = node;
        node.ptrSiguiente = this.ptrInicial;
        this.ptrInicial = node;
    }

    public void eleminar_dato(int date){
        Nodo arr = this.ptrInicial;
        while (arr.date != date) {
            arr = arr.ptrSiguiente;
        }
        arr.ptrAnterior.ptrSiguiente=arr.ptrSiguiente;
        arr.ptrSiguiente.ptrAnterior=arr.ptrAnterior;
    }
    
}