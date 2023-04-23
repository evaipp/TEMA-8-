package aplicacion8.pkg21;

public class Aplicacion821 {

    public static void main(String[] args) {
        System.out.println("Es número 2.4: " + esNumero(2.4));
        System.out.println("Es número 'Dulcinea': " + esNumero("Dulcinea"));
        sumar(1, 2);
        sumar("Sancho ", "Panza");
    }

    static boolean esNumero(Object a) {
        boolean numero = false;
        Class cl = a.getClass(); //obtenemos la claseA de a con getClass()
        /* Los tipos numéricos heredan de la claseA abstracta Number. 
        Por eso empezamos por obtener la superclase de cl y comprobamos
        si es Number: */
        if (cl.getSuperclass().getName().equals("java.lang.Number")) {
            numero = true;
        }
        return numero;
    }

    static void sumar(Object a, Object b) {
        Class claseA = a.getClass();
        Class claseB = b.getClass();
        if (claseA.getName().equals("java.lang.String")
                && claseB.getName().equals("java.lang.String")) {
            //las comillas fuerzan la llamada al toString() de a y b:
            System.out.println("" + a + b);
        } else if (esNumero(a)) {
            /*con parseDouble , convertimos en Double las 
        representaciones de cadena de a y b*/
            System.out.println(Double.parseDouble(a.toString())
                    + Double.parseDouble(b.toString()));
        } else {
            System.out.println("No sumables");
        }
    }
}
