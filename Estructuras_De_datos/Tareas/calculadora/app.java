public class app {

    public static void main(String[] args) {
        Ventana vista = new Ventana();
        Logic logic = new Logic();
        Accions controlador = new Accions(vista);
    }
}