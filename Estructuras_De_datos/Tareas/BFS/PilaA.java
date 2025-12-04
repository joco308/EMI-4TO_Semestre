public class PilaA {
    NodoPila cima, base;
    int cant;

    PilaA(){
        this.cima = null;
        this.base = null;
        this.cant = 0;
    }

    public void agregar(Nodo dato){
        NodoPila nuevo = new NodoPila(dato);
        if (base == null){
            base = nuevo;
        }else{
            cima.sig = nuevo;
            nuevo.ant = cima;
        }
        cima = nuevo;
        this.cant++;
    }

    public NodoPila quitarCima(){
        NodoPila aux = cima;
        if(cant >=2){
            cima = cima.ant;
            cima.sig = null;
            aux.quitarEnlaces();
            this.cant --;
        }else if(cant == 1){
            cima = null;
            base = null;
            this.cant --;
        }
        return aux;
    }

    public NodoPila quitarBase(){
        NodoPila aux = base;
        if(this.cant >2){
            base = base.sig;
            base.ant = null;
            aux.quitarEnlaces();
            this.cant --;
        }else if(this.cant == 1){
            base = null;
            cima = null;
            this.cant --;
        }
        return aux;
    }

    public boolean pilaVacia(){
        return cima == null && base == null;
    }

    public void mostrar(){
        NodoPila nodo = cima;
        System.out.println("=====COLA====");
        System.out.println("Cantidad de Nodos: " + this.cant);
        System.out.println("Entra: " + this.cima);
        System.out.println("Sale: " + this.base);
        while (nodo != null){
            nodo.mostrar();
            nodo = nodo.ant;
        }
    }
}
