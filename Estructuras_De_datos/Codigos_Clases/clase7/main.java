import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrera sistemas = new Carrera("SISTEMAS");
        int option;
        do{
            System.out.println("1. Agregar curso\n2. Eliminar curso\n3. Mostrar cursos\n4. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sistemas.add();
                    break;
                case 2:
                    sistemas.kick();
                    break;
                case 3:
                    sistemas.mostrar();
                    break;
                case 4:
                    System.out.println("Adios!!");
                    break;
                default:
                    break;
            }
        }while(option<4);
        
    }
    
}