
public class Main {
    MAIN

    import java.util.Arrays;
    import java.util.Scanner;

    public class{

    public static void main(String[] args) {
       ("CREA TU CANCION\nLas notas musicales son: Do, Re, Mi, Fa, Sol, La, Si\nEscoja una nota y si quieres salir para mostrar la cancion escribe salir");
        Nota notaUsuario;
        String notaIntroducidaString;
        do {
            System.out.print("Ingrese la nota de la cancion:");
            notaIntroducidaString = sc.next().toUpperCase();
            notaUsuario = Nota.valueOf(notaIntroducidaString);
            cancion = Arrays.copyOf(cancion, cancion.length + 1);
            cancion[cancion.length - 1] = notaUsuario;
        } while (!notaIntroducidaString.equals("SALIR"));
        for (Nota nota : cancion) {
            c.add(nota);
        }
        c.interpretar();
    }
}

}
