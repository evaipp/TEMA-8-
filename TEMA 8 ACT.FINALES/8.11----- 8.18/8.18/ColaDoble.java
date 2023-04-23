package aplicacion8.pkg18;

public class ColaDoble extends Cola {

    void encolarPrincipio(Integer elemento) {
        insertarPrincipio(elemento);
    }

    Integer desencolarFinal() {
        return eliminar(numeroElementos() - 1);
    }
}
