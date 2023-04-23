package aplicacion8.pkg19;

public class Conjunto extends Lista {

    @Override
    void insertarPrincipio(Integer elemento) {
        if (buscar(elemento) == -1) {
            super.insertarPrincipio(elemento);
        }
    }
    
    @Override
    void insertarFinal(Integer elemento){
        if (buscar(elemento) == -1) {
            super.insertarFinal(elemento);
        }
    }
}
