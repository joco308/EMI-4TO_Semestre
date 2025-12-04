public class Nodo {
    int dato;
    Nodo h1,h2;

    Nodo(int dato){
        this.dato = dato;
        this.h1=null;
        this.h2=null;
    }

    public void mostrar(){
        System.out.println("-----------------------------\nDato: "+this.dato+"\nHijo1: "+this.h1+"\nHijo2: "+this.h2+"\n-----------------------------");
    }
}