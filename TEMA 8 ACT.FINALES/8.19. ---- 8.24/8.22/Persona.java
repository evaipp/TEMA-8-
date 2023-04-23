package aplicacion8.pkg22;

public class Persona {

    static int numObjetos = 0;/*atributo estático para contar 
    el nº de objetos creados*/
    int nombre;
    int edad; //podríamos añadir más atributos y métodos

    public Persona() {
        numObjetos++; /*el constructor se ejecuta cuando 
        se crea un nuevo objeto*/
    }
/*El recolector de basura se ejecuta cuando estima oportuno. 
Esto ocurre cuando la cantidad de memoria no accesible es 
considerable. Para esto el número de objetos no es significativo,
ya que dependerá del tamaño de la memoria y la ejecución de otros
procesos.*/

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Recolector de basura en funcionamiento.");
        System.out.println("Número de objetos creados: " + numObjetos);
        System.exit(0);/*cuando el recolector libera el primer 
        objeto paramos el programa Si comentamos la línea anterior
        podremos hacer un seguimiento de cuando se ejecuta el 
        recolector de basura.*/
    }
}
