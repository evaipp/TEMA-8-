
package aplicacion8.pkg20;


public class Aplicacion820 {

    public static void main(String[] args) {
        Conjunto c1=new Conjunto();
        c1.insertarFinal(1);
        c1.insertarFinal(2);
        c1.insertarFinal(3);
        c1.insertarFinal(4);
        c1.insertarFinal(5);
        c1.insertarFinal(6);
        c1.insertarFinal(7);
        Conjunto c2=new Conjunto();
        c2.insertarFinal(3);
        c2.insertarFinal(4);
        c2.insertarFinal(1);
        c2.insertarFinal(7);
        c2.insertarFinal(5);
        c2.insertarFinal(2);
        c2.insertarFinal(6);
        c2.insertarFinal(9);
        
        System.out.println(c1.equals(c2));
        
        
        
    }
    
}
