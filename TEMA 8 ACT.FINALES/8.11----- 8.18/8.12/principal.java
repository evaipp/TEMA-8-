public class Main {

    public static void main(String[] args) {
    Caja caja1 = new Caja(10, 20, 30, Unidad.CM); 
    System.out.println("Caja 1: " + caja1); 
    System.out.println("Volumen de caja 1: " + caja1.getVolumen());
        Caja caja2 = new Caja(5, 10, 15, Unidad.M); 
        caja2.setEtiqueta("Caja frágil");
        System.out.println("Caja 2: " + caja2);
        System.out.println("Volumen de caja 2: " + caja2.getVolumen());
    }
}}}
