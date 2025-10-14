public class Principal {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.agregar("e");
        pila.agregar("d");
        pila.agregar("c");
        pila.agregar("b");
        pila.agregar("a");
        Nodo node = pila.sacar();
        System.out.println("Cantidad: "+ pila.cant);
        System.out.println("Cima: "+ pila.cima);
        pila.mostrar();
        System.out.println("-----Nodo que se saco-------");
        System.out.println("Siguiente: "+node.sig);
        System.out.println("Dato: "+node.dato);
        System.out.println("Anterior: "+ node.ant);
        System.out.println("-----------------------------");
    }
    
}