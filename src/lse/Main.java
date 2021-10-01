package lse;

public class Main {
    public static void main(String[] args) {
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        //insertar elementos
        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);

        //mostrar lista
        listaSimplementeEnlazada.mostrar();

        //eliminar
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //,ostrar lista con elementos eliminados
        listaSimplementeEnlazada.mostrar();

    }
}
