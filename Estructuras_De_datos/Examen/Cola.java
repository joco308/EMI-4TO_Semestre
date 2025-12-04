public class Cola {
    NodoCola entra,sale;

    Cola(){
        this.entra = null;
        this.sale =  null;
    }

    public void add(Nodo dato){
        if(dato==null){
            return;
        }
        NodoCola nuevo = new NodoCola(dato);
        if(this.entra==null){
            this.entra = nuevo;
            this.sale= nuevo;
        }else{
            nuevo.sig = this.entra;
            this.entra.ant = nuevo;
            this.entra = nuevo;
        }
    }
    public Nodo sacar(){
        if(this.sale == null) return null;
        Nodo dato = this.sale.dato;
        if(this.sale == this.entra){
            this.sale = null;
            this.entra = null;
        } else {
            this.sale = this.sale.ant;
            if(this.sale != null) this.sale.sig = null;
        }
        return dato;
    }


    
}