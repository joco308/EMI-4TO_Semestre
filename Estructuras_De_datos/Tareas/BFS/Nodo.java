public class Nodo {
    String dato;
    Nodo pp, p1,p2,p3;
    Nodo(String dato){
        this.dato = dato;
        this.pp = null;
        this.p1 = null;
        this.p2 = null;
        this.p3 = null;
    }
    public void mostrar(){
        
        System.out.println("==================");
        System.out.println("Nodo Padre: " + pp);
        System.out.println("==================");
        System.out.println("Dato Nodo " + dato);
        System.out.println("==================");
        System.out.print("|P_1: " + p1);
        System.out.print("|  |P_2: " + p2);
        System.out.println("|  |P_3: " + p3 + "|");
        System.out.println("==================");
    }
    public boolean esHoja(){
        return p1 == null && p2 ==null && p3 ==null;
    }

}
