public class Pila {
    Nodo cima;
    int cant;
    public Pila(){
        this.cima = null;
        this.cant = 0;
    }

    public void agregar(String dato){
        Nodo node = new Nodo(dato);
        node.ant = this.cima;
        node.sig = null;
        try{
            this.cima.sig = node;
            this.cima = node;
        }catch (Exception e){
            this.cima = node;
        }
        this.cant++;
    }

    public Nodo sacar(){
        if(this.cima==null){
            System.out.println("La pila esta vacia.");
            return null;
        }
        Nodo sacar = this.cima;
        this.cima = sacar.ant;
        this.cima.sig = null;
        sacar.ant = null;
        sacar.sig = null;
        this.cant--;
        return sacar;
    }

    public void mostrar(){
        if(this.cima == null){
            System.out.println("LA PILA ESTA VACIA.");
            return;
        }
        Nodo ptr = this.cima;
        while (ptr != null) {
            System.out.println("=============================================");
            System.out.println("Anterior: "+ptr.ant);
            System.out.println("Dato: "+ptr.dato);
            System.out.println("Siguiente: "+ ptr.sig);
            ptr = ptr.ant;
        }
    }
}