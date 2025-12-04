public class Cola {
    NodoCola entra, sale;
    int cantidad; 
    Cola(){
        entra = null;
        sale = null;
        cantidad = 0;
    }
    public void poner(Nodo n){
        NodoCola nodo = new NodoCola(n);
        if (entra == null){
            sale = nodo;
        }else{
            nodo.sig = entra;
            entra.ant = nodo;
        }
        entra = nodo;
        cantidad++;
    }
    public Nodo sacar(){
        NodoCola actual = sale;
        if (cantidad == 1){
            actual.quitar_enlaces();
            sale = null;
            entra = null;
            cantidad --;
        } else if(actual != null){
            sale = sale.ant;
            sale.sig = null;
            actual.quitar_enlaces();
            cantidad --;
            }else{
                return null;
            }
        return actual.dato;
    }
    public void mostrar(){
        NodoCola nodo = sale;
        System.out.println("=====COLA====");
        System.out.println("Cantidad de Nodos: " + cantidad);
        System.out.println("Entra: " + entra);
        System.out.println("Sale: " + sale);
        while (nodo != null){
            nodo.mostrar();
            nodo = nodo.ant;
        }
    }

    public boolean colaVacia(){
        return entra == null && sale == null;
    }
}
