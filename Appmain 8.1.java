import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Hora r = new Hora(11 , 30);
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
            System.out.println(r);
            System.out.println("Escriba una hora");
            int hora = new Scanner(System.in).nextInt();
            boolean cambio = r.setHoras(hora);
            if (cambio) {
                System.out.println(r);
            } else {
                System.out.println("La hora no se pudo cambiar");

            }
        }


    }

    
