public class Curso {
    String name;
    String stu[];
    int cant;
    Curso preb;
    Curso after;
    public Curso(int c, String[] e, String n){
        this.cant = c;
        this.stu = e;
        this.name = n;
    }

    public void mostrar(){
        System.out.println("Nombre: "+this.name);
        System.out.println("Cantidad de Estudiantes: "+cant);
    }
}
