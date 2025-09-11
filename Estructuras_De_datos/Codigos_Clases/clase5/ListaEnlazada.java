public class ListaEnlazada {
    Nodo nodoFrist;

    ListaEnlazada(int date){
        this.nodoFrist = new Nodo(date);
    }

    void añadir_datos(int date){
        Nodo nodo =  new Nodo(date);
        Nodo ptr = this.nodoFrist;
        while (ptr.ptr != null) {
            ptr = ptr.ptr;
        }
        ptr.ptr = nodo;
    }

    void añadir_datos_inicio(int date){
        Nodo arr = new Nodo(date);
        arr.ptr = this.nodoFrist;
        this.nodoFrist = arr;
    }

    void mostrar_datos(){
        Nodo ptr = this.nodoFrist;
        while (ptr != null) {
            System.out.print(ptr.date+" ---> ");
            ptr=ptr.ptr;
        }
        System.out.println("null");
    }

    void quitar_dato(int date){
        Nodo arr = this.nodoFrist;
        if (arr.date == date) {
            this.nodoFrist = arr.ptr;
        }else{
            while (arr.ptr.date != date) {
                arr = arr.ptr;
            }
            arr.ptr = arr.ptr.ptr;
        }
    }

    int buscar_por_dato(int dato){
        int count = 0;
        Nodo arr = this.nodoFrist;
        while (arr.date != dato) {
            arr = arr.ptr;
            count++;
        }
        if (arr == null){
            return -1;
        }else{
            return count;
        }
    }

    Integer buscar_por_pocicion(int date){
        Nodo arr = this.nodoFrist;
        for(int i = 0 ; i<date; i++){
            arr = arr.ptr;
        }
        if(arr==null){
            return null;
        }else{
            return arr.date;
        }
    }

    public void agregar_pos(int date, int pos){
        Nodo node = new Nodo(date);
        Nodo act = this.nodoFrist;
        if(pos==0){
            node.ptr = this.nodoFrist;
            this.nodoFrist=node;
        }else{
            for(int i = 0; i<pos-1;i++){
                if(act == null){
                    System.out.println("No se pudo añadir en la pocicion "+pos);
                    break;
                }
                act = act.ptr;
            }
            if(act != null){
                node.ptr = act.ptr;
                act.ptr = node;
            }
        }
    }
    
}