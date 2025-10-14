public class Cola
{
    NodoCola entra, sale;
    int cant;
    Cola()
    {
        this.entra=null;
        this.sale=null;
        this.cant=0;
    }
    
    public void poner(Nodo n)
    {
        NodoCola nuevo =  new NodoCola(n);
        if(this.entra==null)
          {
            this.entra = nuevo;
            this.sale = nuevo; 
          }
        else
          {
            this.entra.ant = nuevo;
            nuevo.sig = this.entra;
            this.entra = nuevo;
          }
        this.cant++;
    }

    public NodoCola sacar()
    {
        NodoCola act;
        act = this.sale;
        this.sale = this.sale.ant;
        this.sale.sig = null;
        act.ant = null;
        this.cant--;
        return act;
    }
}