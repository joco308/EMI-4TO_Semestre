public class Arbol
{
    Nodo raiz;
    int grado,nivel,cant,op;
    Cola miCola;

    Arbol(){
        this.raiz=null;
        this.grado = 0;
        this.nivel =0;
        this.cant=0;
        this.op=1;
        this.miCola=new Cola();
    }

    public void agregar(String d)
    {
        Nodo nuevo = new Nodo(d);
        this.miCola.poner(nuevo);
        if(this.raiz == null)
          {
            this.raiz = nuevo;
          }
        else
          {
            nuevo.pp = this.miCola.sacar();
            switch (op)
                   {case 1:
                        this.miCola.sale.p1 = nuevo;
                    break;
            
                default:
                    break;
            }
          }
    }
    
}