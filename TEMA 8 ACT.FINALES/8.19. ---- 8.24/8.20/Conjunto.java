package aplicacion8.pkg20;

public class Conjunto extends Lista {

    @Override
    void insertarPrincipio(Integer elemento) {
        if (buscar(elemento) == -1) {
            super.insertarPrincipio(elemento);
        }
    }

    @Override
    void insertarFinal(Integer elemento) {
        if (buscar(elemento) == -1) {
            super.insertarFinal(elemento);
        }
    }

    public boolean equals(Object otro) {
        /*No podemos usar el equals() heredado de Lista,
        ya que éste tiene en cuenta el oren de los 
        elementos. Deberemos recorrer el conjunto this y
        y luego el conjunto otro. Si todos los elementos
        de cada uno están en el otro, es que son iguales*/ 
        boolean iguales = true;
        for (int i = 0; i < numeroElementos() && iguales; i++) {
            if (buscar(((Conjunto) otro).get(i)) == -1) {
                iguales = false;
            }
        }
        for (int i = 0; i < ((Conjunto) otro).numeroElementos() &&
                iguales; i++) {
                if (((Conjunto) otro).buscar(this.get(i)) == -1) {
                    iguales = false;
                }
            }
        return iguales;
    }
}
