
public class Arbol {
    Nodo raiz;
    int grado, nivel, cant;
    int op;
    Cola micola;
    Arbol(int grado){
        this.raiz  = null;
        this.grado = grado;
        this.nivel = 0;
        this.cant = 0; 
        this.op = 1;
        this.micola = new Cola();
    }
    public void agregarBFS(String d){
        Nodo nuevo = new Nodo(d);
        Nodo act;
        if (raiz ==null){
            raiz = nuevo;
            
        }else{
            act = micola.sale.dato;
            switch(op){
                case 1 -> {
                    act.p1 = nuevo;
                    op++;
                }
                case 2 ->{
                    act.p2 = nuevo;
                    op++;
                }
                case 3 ->{
                    act.p3 = nuevo;
                    op=1;
                    micola.sacar();
                }
            }
            nuevo.pp = act;
        }
        micola.poner(nuevo);
        cant ++;
        int aux = cant-1;
        while(aux%3 == 0 && aux!= 0){
            aux/=3;
        }
        if (aux == 1 && cant != 2){
            nivel++;
        }
    }
    public Nodo buscarBFS(String var){
        Cola colaaux = new Cola();
        Nodo actual;
        colaaux.poner(raiz);
        System.out.println("================");
        System.out.println("\nINICIO RECORRIDO");
        while(!colaaux.colaVacia()){
            actual = colaaux.sacar();
            actual.mostrar();
            if(actual.dato.equals(var)){
                System.out.println("FIN RECORRIDO...");
                System.out.println("================\n");
                return actual;
            }
            if (!actual.esHoja()){
                if(actual.p1 != null){
                    colaaux.poner(actual.p1);
                }
                if(actual.p2 != null){
                    colaaux.poner(actual.p2);
                }
                if(actual.p3 != null){
                    colaaux.poner(actual.p3);
                }
            }

        }
        System.out.println("FIN RECORRIDO...");
        System.out.println("================\n");
        return null;
    }

    public Nodo buscarDFS(String var){
        PilaA pAux = new PilaA();
        Nodo actual = raiz;
        pAux.agregar(actual);
        System.out.println("================");
        System.out.println("\nINICIO RECORRIDO");
        while (!pAux.pilaVacia()){
            actual = pAux.quitarCima().dato;
            actual.mostrar();
            if (actual.dato.equals(var)){ 
                System.out.println("FIN RECORRIDO...");
                System.out.println("================\n");
                return actual;
            }
            if(actual.esHoja() == false){
                if (actual.p3 != null){
                    pAux.agregar(actual.p3);                
                }
                if (actual.p2 != null){
                    pAux.agregar(actual.p2);                
                }
                if (actual.p1 != null){
                    pAux.agregar(actual.p1);                
                }              
            }
        }
        System.out.println("FIN RECORRIDO...");
        System.out.println("================\n");
        return null;
    }
    public void mostrarBFS(){
        Cola colaM = new Cola();
        int pot = 0;
        colaM.poner(raiz);
        System.out.println("===ARBOL===");
        
        bucleP: while(colaM.sale != null){
            for(int i = 1; i<=Math.pow(grado, pot); i++){
                if (colaM.sale.dato.p1 != null){
                    colaM.poner(colaM.sale.dato.p1);
                }
                if (colaM.sale.dato.p2 != null){
                    colaM.poner(colaM.sale.dato.p2);
                }
                if (colaM.sale.dato.p3 != null){
                    colaM.poner(colaM.sale.dato.p3);
                }
                System.out.print(colaM.sacar().dato + " ");
                if (i%3 == 0 && i!=0){
                    System.out.print("|");
                }
                if(colaM.sale == null){
                    break bucleP;
                }
            }
            pot++;
            System.out.println("");
        }
        System.out.println("\n===========");
        System.out.println("Nivel: " + pot);
        System.out.println("Grado: " + grado);
        System.out.println("Cantidad: " + cant);
    }

}
