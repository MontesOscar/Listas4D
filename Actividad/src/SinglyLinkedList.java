public class SinglyLinkedList {
    Nodo cabeza;

    SinglyLinkedList() {
        this.cabeza = null;
    }

    public void insertar(Integer valor) {
        Nodo nuevoNodo = new Nodo(valor);// crear el nuevo
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else {
            Nodo temp = cabeza;// Seleccionar el primer nodo
            // Lo vamos a recorrer todod los nodos
            while (temp.siguiente != null) {
                temp = temp.siguiente;

            }
            temp.siguiente = nuevoNodo;// creacion del nuevo nodo
        }

    }

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.print("null");

    }

}
