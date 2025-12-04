public class Arbol {
    Nodo raiz;

    public Arbol(){
        this.raiz = null;
    }

    public void add_arbol(int dato){
        Nodo nuevo = new Nodo(dato);
        if (this.raiz == null) {
            this.raiz = nuevo;
            return;
        }
        Nodo ptr = this.raiz, parent = null;
        while (ptr != null) {
            parent = ptr;
            if (dato < ptr.dato) {
                ptr = ptr.h1;
            } else {
                ptr = ptr.h2;
            }
        }
        if (dato < parent.dato) parent.h1 = nuevo;
        else parent.h2 = nuevo;
    }

    public void mostrarBFS(){
        Cola cola = new Cola();
        cola.add(this.raiz);
        Nodo n;
        do {
            n = cola.sacar();
            try{
                n.mostrar();
            }catch(Exception e){
                break;
            }
            cola.add(n.h1);
            cola.add(n.h2);
        } while (n!=null);
    }

    public void busquedaBinaria(int objetivo) {
        if (this.raiz == null) {
            System.out.println("Arbol vacio");
            return;
        }
        Nodo ptr = this.raiz;
        StringBuilder ruta = new StringBuilder();
        int saltos = 0;
        while (ptr != null) {
            if (ruta.length() > 0) ruta.append(" -> ");
            ruta.append(ptr.dato);
            if (ptr.dato == objetivo) {
                System.out.println("Ruta: " + ruta.toString());
                System.out.println("Saltos: " + saltos);
                System.out.println("Resultado: "+ptr.dato+" encontrado");
                return;
            }
            if (objetivo < ptr.dato) ptr = ptr.h1;
            else ptr = ptr.h2;
            saltos++;
        }
        System.out.println("Ruta: " + ruta.toString());
        System.out.println("Saltos: " + saltos);
        System.out.println("Resultado: no encontrado");
    }
}