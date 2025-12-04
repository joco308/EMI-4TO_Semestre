public class Principal {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        int[] datos = {23,5,8,45,32,24,51,33,18,-6,17,41,31,19,-2};
        
        for(int i : datos){
            arbol.add_arbol(i); 
        }

        arbol.mostrarBFS();

        arbol.busquedaBinaria(32);
        arbol.busquedaBinaria(19);
        arbol.busquedaBinaria(10000);
    }
}