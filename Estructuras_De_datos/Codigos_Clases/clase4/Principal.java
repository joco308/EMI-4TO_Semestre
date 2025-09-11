public class Principal {
    public static void main(String[] args) {
        Nodo nodoA = new Nodo(800);
        Nodo nodob = new Nodo(30);
        Nodo nodoc = new Nodo(5);
        Nodo nodod = new Nodo(3);

        nodoA.ptr=nodob;
        nodob.ptr=nodoc;
        nodoc.ptr =nodod;

        Nodo arg = nodoA;

        while (arg!=null) {
            arg.mostrar();
            arg = arg.ptr;
        }
    }
}