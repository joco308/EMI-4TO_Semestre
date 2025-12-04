public class NodoCola {
    Nodo dato;
    NodoCola sig, ant;
    NodoCola(Nodo dato){
        sig = null;
        ant = null;
        this.dato = dato;
    }
    public void quitar_enlaces(){
        sig = null;
        ant = null;
    }
    public void mostrar(){
        System.out.println("------------------");
        System.out.println("sig: " + sig);
        dato.mostrar();
        System.out.println("anterior: " + ant);
        System.out.println("------------------");
    }
}
