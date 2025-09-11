import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion; 
        ListaEnlazada lista = null;
        int add;

        do{
            System.out.println("\t|MENU|\n1. Agragar dato al inicio\n2. Agragar dato al final\n3. Mostrar\n4. Eliminar dato\n5. Buscar nodo por dato\n6. Buscar por posicion\n7. Agregar por pocicion\n8. Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato: ");
                    add = sc.nextInt();
                    if (lista == null) {
                        lista = new ListaEnlazada(add);
                    }else{
                        lista.añadir_datos_inicio(add);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el dato: ");
                    add = sc.nextInt();
                    if (lista == null) {
                        lista = new ListaEnlazada(add);
                    }else{
                        lista.añadir_datos(add);
                    }
                    break;
                case 3:
                    lista.mostrar_datos();
                    break;
                case 4:
                    System.out.print("Ingrese el dato a eliminar: ");
                    add = sc.nextInt();
                    lista.quitar_dato(add);
                    break;
                case 5:
                    System.out.print("Ingrese el dato a Buscar: ");
                    add = sc.nextInt();
                    System.out.println("La pocicion de ese dato es: "+ lista.buscar_por_dato(add));
                    break;
                case 6:
                    System.out.print("Ingrese el dato a eliminar: ");
                    add = sc.nextInt();
                    System.out.println("El dato es: "+ lista.buscar_por_pocicion(add));
                    break;
                case 7:
                    System.out.println("Ingrese el nuevo dato del nodo: ");
                    add = sc.nextInt();
                    System.out.println("Ingrese el la pos: ");
                    int add_1 = sc.nextInt();
                    lista.agregar_pos(add, add_1);
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
                    break;
            }

        }while(opcion<=8);
    }
    

    
}