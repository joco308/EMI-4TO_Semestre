public class Lista
{
    Nodo starNode = null;
    Nodo endNode = null;
    
    Lista(Nodo node)
    {
        this.starNode = node;
        this.endNode = node;
    }

    void add_list(Nodo node)
    {
        this.endNode.ptr = node;
        this.endNode = node;
    }

    void print_list()
    {
        Nodo puntero = this.starNode;
        while(puntero != null)
        {
            if(puntero.dateInt !=null)
            {
                System.out.println(puntero.dateInt);    
            }else if (puntero.dateDouble != null)
            {
                System.out.println(puntero.dateDouble);
            }else if(puntero.dateFloat != null)
            {
                System.out.println(puntero.dateFloat);
            }else if(puntero.dateLong != null){
                System.out.println(puntero.dateLong);
            }else{
                System.out.println(puntero.dateShort);
            }

            puntero = puntero.ptr;
        }
    }
}