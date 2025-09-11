
public class Principal
{
    public static void main(String[] agrs)
    {
        EstructuraDeDatos miObjeto = new EstructuraDeDatos();
        miObjeto.max_min_short();
        miObjeto.max_min_double();
        miObjeto.max_min_float();
        miObjeto.max_min_int();
        miObjeto.max_min_long();

        miObjeto.mostrar();

        Lista lista = new Lista(new Nodo(3));

        lista.add_list(new Nodo(1.13));

        lista.print_list();

        lista.add_list(new Nodo(40000));

        lista.add_list(new Nodo(1.5f));

        lista.print_list();
    }
}