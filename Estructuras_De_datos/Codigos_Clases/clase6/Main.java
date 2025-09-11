public class Main {

    public static void main(String[] args) {
        ListasDoblementeEnlazada lista = new ListasDoblementeEnlazada(30);
        lista.añadir(50);
        lista.añadir(90);
        lista.añadir(70);
        lista.añadir(5);

        lista.mostar_adelante_atras();

        System.out.println("-------------------");

        lista.mostrar_atras_adelante();

        lista.eleminar_dato(90);

        System.out.println("-------------------");

        lista.mostar_adelante_atras();
    }
}