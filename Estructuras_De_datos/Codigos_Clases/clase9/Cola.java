public class Cola {
  NodoCola entra, sale, saleNN;
  int cant;

  Cola() {
    this.entra = null;
    this.sale = null;
    this.saleNN=null;
    this.cant = 0;
  }

  public void poner(Nodo n) {
    NodoCola nuevo = new NodoCola(n);
    if (this.entra == null) {
      this.entra = nuevo;
      this.sale = nuevo;
      this.saleNN = nuevo;
    } else {
      this.entra.sig = nuevo;
      nuevo.ant = this.entra;
      this.entra = nuevo;
    }
    this.cant++;
  }

  public NodoCola sacar() {
    NodoCola act = this.sale;
    this.sale = this.sale.ant;
    this.sale.sig = null;
    act.sig = null;
    this.cant--;
    return act;
  }

  public NodoCola sacarNN() {
    try{
      NodoCola sal = this.saleNN;
      this.saleNN = this.saleNN.sig;   
      return sal;
    }catch (NullPointerException e){
      this.saleNN = null;
      return null;
    }
  }

  public void defaut(){
    this.saleNN = this.sale;
  }
}
