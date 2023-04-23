package aplicacion8.pkg16;

public class Pila extends Lista {

    void apilar(Integer elemento) {
        insertarFinal(elemento);
    }

    Integer desapilar() {
        return eliminar(numeroElementos() - 1);
    }

}
