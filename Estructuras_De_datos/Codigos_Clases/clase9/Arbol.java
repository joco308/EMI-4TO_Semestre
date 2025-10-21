public class Arbol
{
  Nodo raiz;
  int cant, op;
  Cola miCola;

  Arbol(){
    this.raiz=null;
    this.cant=0;
    this.op = 1;
    this.miCola=new Cola();
  }

  public void agregar(String d){
  Nodo nuevo = new Nodo(d);
  if(this.raiz == null){
      this.raiz = nuevo;
  }else{
    Nodo ultimo;
    do{
      ultimo = this.miCola.sacarNN().dato;
    }while(ultimo.p3!= null);
    switch (this.op) {
      case 1:
        ultimo.p1 = nuevo;
        nuevo.pp = ultimo;
        this.op++;
        break;
      case 2:
        ultimo.p2 = nuevo;
        nuevo.pp = ultimo;
        this.op++;
        break;
      case 3:
        ultimo.p3 = nuevo;
        nuevo.pp = ultimo;
        this.op = 1;
        break;
      default:
        break;
    }
    miCola.defaut();
    
  }
    this.cant++;
    this.miCola.poner(nuevo);
  }

  public void mostrar(){
    NodoCola arg;
    System.out.println("\n");
    System.out.println("__________________________________");
    System.out.println("Arbol:\n\tCantidad: "+this.cant);
    do{
      try{
        arg = this.miCola.sacarNN();
        arg.dato.mostrar();
      }catch (NullPointerException e){
        arg = null;
      }
    }while(arg!=null);
    System.out.println("\n");
    this.miCola.defaut();
  }
}
