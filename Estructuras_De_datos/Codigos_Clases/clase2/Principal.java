import java.util.Scanner;
public class Principal {
	public static void limpiarBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine(); // Como el buffer en C++
        }
    }
    public static void main(String[] args) 
    {
    		Scanner leer = new Scanner(System.in);
		String no,ap,am;
    		int cantReg,ed;
    		double pe;
    		char sex;
    		Alumno a1 = new Alumno("Andres","Mamani","Avalos",19,'M',42.8);
    		Curso cuartoA = new Curso();
    		cuartoA.regEstudiante(a1);
    		System.out.print("Cuantos estudiantes desea registrar: ");
    		cantReg = leer.nextInt();
    		System.out.println("INICIANDO REGISTRO DE ESTUDIANTES...");
    		for (int i=0; i<cantReg; i++) {
    			limpiarBuffer(leer); // Refrescando la memoria JOcoOO
				System.out.println("**************************");
    			System.out.print("Nombre: ");
    			no = leer.nextLine();
    			System.out.print("Apellido Paterno: ");
    			ap = leer.nextLine();
    			System.out.print("Apellido Materno: ");
    			am = leer.nextLine();
    			System.out.print("Edad: ");
    			ed = leer.nextInt();
    			System.out.print("Peso: ");
    			pe = leer.nextDouble();
    			leer.nextLine();
    			System.out.print("Sexo: ");
    			sex = leer.next().charAt(0);
    			Alumno a2 = new Alumno(no,ap,am,ed,sex,pe);
    			cuartoA.regEstudiante(a2);
    		}
    		cuartoA.mostrarReg();
    		
    		leer.close();
    }
}
