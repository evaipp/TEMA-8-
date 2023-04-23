
package aplicacion8.pkg18;


public class Cola extends Lista{
    
    void encolar(Integer elemento){
        insertarFinal(elemento);
    }
    
    Integer desencolar(){
        return eliminar(0);
    }
}
