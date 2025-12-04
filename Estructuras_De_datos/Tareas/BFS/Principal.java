import java.util.Scanner;

public class Principal{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        Arbol arbol1 = new Arbol(3);
        char opM;
        String dato;
        bMenu: while (true){
            System.out.println("=====MENU=====");
            System.out.println("1.- Agregar elemento al Arbol");
            System.out.println("2.- Agregar VARIOS elementos al Arbol");
            System.out.println("3.- Mostrar Arbol");
            System.out.println("4.- BUSCAR DFS");
            System.out.println("5.- BUSCAR BFS");
            System.out.println("6.- Salir del MENU");
            System.out.print("Ingrese una nueva opcion: "); opM = read.next().charAt(0);
            read.nextLine();
            switch(opM){
                case '1' -> {
                    System.out.print("Ingrese el dato a agregar: ");
                    dato = read.nextLine();
                    arbol1.agregarBFS(dato);
                }
                case '2' ->{
                    System.out.println("Los Datos dejaran de entrar al escribir exit");
                    dato = "";
                    while (true){
                        dato = read.nextLine();
                        
                        if (dato.equals("exit")||dato.equals("EXIT")){
                            break;
                        }
                        arbol1.agregarBFS(dato);
                    }
                }
                case '3' -> {
                    arbol1.mostrarBFS();
                }
                case '4' -> {
                    System.out.print("Ingrese el dato a buscar: ");
                    dato = read.nextLine();
                    Nodo aux = arbol1.buscarDFS(dato);
                    if (aux != null){
                        aux.mostrar();
                    }else{
                        System.out.println("\nEL NODO NO FUE ENCONTRADO\n");
                    }
                }
                case '5' -> {
                    System.out.print("Ingrese el dato a buscar: ");
                    dato = read.nextLine();
                    Nodo aux = arbol1.buscarBFS(dato);
                    if (aux != null){
                        aux.mostrar();
                    }else{
                        System.out.println("\nEL NODO NO FUE ENCONTRADO\n");
                    }
                }
                case '6' -> {
                    break bMenu;
                }
                default ->{
                    System.out.println("Opcion no valida...");
                }
            }
        }
        read.close();
    }
}