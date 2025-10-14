public class Nodo {
    Nodo ant,sig;
    String dato;
    public Nodo(String dato){
        this.dato = dato;
        sig=null;
        ant=null;
    }
    public void mostrar(){
        System.err.println(this.ant);
        System.err.println(this.dato);
        System.out.println(this.sig);
    }
    
}