public class app {

    public static void main(String[] args) {
        Ventana vista = new Ventana();
        Logica l = new Logica();
        Controlador controlador = new Controlador(vista);
    }
}