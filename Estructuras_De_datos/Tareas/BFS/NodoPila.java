public class NodoPila {
    Nodo dato;
    NodoPila sig, ant;
    NodoPila(Nodo dato){
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }

    public void quitarEnlaces(){
        this.sig = null;
        this.ant = null;
    }
    public void mostrar(){
        System.out.println("------------------");
        System.out.println("sig: " + sig);
        dato.mostrar();
        System.out.println("anterior: " + ant);
        System.out.println("------------------");
    }
}
