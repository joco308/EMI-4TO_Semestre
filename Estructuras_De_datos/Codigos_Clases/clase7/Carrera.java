import java.util.Scanner;

public class Carrera {
    String nameCarrera;
    Curso fristCurso;
    Curso lestCurso;
    Scanner sc = new Scanner(System.in);
    public Carrera(String name){
        this.nameCarrera=name;
        this.fristCurso=null;
        this.fristCurso=null;
    }

    public void add(){
        System.out.println("Ingrese el nombre del curso: ");
        String c = this.sc.next();
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int n;
        do{
            n = this.sc.nextInt();
        }while (n>50);
        String[] e = new String[n];
        System.out.println("Ingrese el listado de estudiantes: ");
        for(int i = 0 ; i<n; i++){
            e[i]=this.sc.next();
        }
        Curso node = new Curso(n, e, c);
        node.after=null;
        if(this.fristCurso == null){
            this.fristCurso = node;
            this.lestCurso = node;
            node.preb = null;
            return;    
        }
        node.preb = this.lestCurso;
        this.lestCurso.after = node;
        this.lestCurso = node;
    }

    public void kick(){
        Curso ptr = this.fristCurso;
        Curso arr = this.lestCurso;
        if(ptr==null){
            System.out.println("No hay elementos");
            return;
        }
        System.out.print("Ingrese el nombre del curso para eliminar: ");
        String n = this.sc.nextLine();
        if(this.fristCurso.name ==n){
            this.fristCurso = this.fristCurso.after;
            this.fristCurso.preb = null;
            return;
        }else if(this.lestCurso.name == n){
            this.lestCurso = this.lestCurso.preb;
            this.lestCurso.after = null;
            return;
        }
        while (ptr.name != n || arr.name != n){
            ptr = ptr.after;
            arr = arr.preb;
        }
        if(ptr.name==n){
            ptr.preb.after=ptr.after;
            ptr.after.preb = ptr.preb;
        }else{
            arr.preb.after=arr.after;
            arr.after.preb = arr.preb;
        }
    }

    public void mostrar(){
        System.out.println("==============================================");
        Curso ptr = this.fristCurso;
        if(ptr == null){
            System.out.println("No hay elementos");
            return;
        }
        while (ptr!=null) {
            System.out.println("Anterior: "+ptr.preb);
            System.out.println("Siguente: "+ptr.after);
            System.out.println("Nombre del Curso: "+ ptr.name+"\nCantidad de estudiantes: "+ptr.cant+"\nEstudiantes:");
            for(int i = 0 ; i<ptr.stu.length;i++){
                System.out.println((i+1)+". "+ptr.stu[i]);
            }
            ptr = ptr.after;
            System.out.println("=====================================================");
        }
    }
}