import java.util.Scanner;

public class Pricipal {
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        Scanner cs = new Scanner(System.in);
        int op;
        do{
            System.out.println("-------------ARBOL-------------\n1. Agregar\n2. Mostrar\n3. Salir\n");
            System.out.print("Digite una opcion: ");
            String dato;
            op = cs.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\nDigite la letra que desea agragar: ");
                    dato = cs.next();
                    System.out.println("\n");
                    miArbol.agregar(dato);
                    break;
                case 2:
                    miArbol.mostrar();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=3);
    }
    
}