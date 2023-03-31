public class App {
    public static void main(String[] args) throws Exception {
      Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL,Nota.RE, Nota.FA};
     // Piano p = new Piano();
      Campana c = new Campana();
      for (Nota nota : cancion) {
          c.add(nota);
      }
      c.interpretar();


      

    }
}
