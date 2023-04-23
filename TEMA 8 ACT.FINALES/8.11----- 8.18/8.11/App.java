public class App {
    public static void main(String[] args) throws Exception {
        Class Campana

    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (Nota nota : melodia) {
            switch (nota) {
                case DO -> {
                    System.out.print("do ");
                }
                case RE -> {
                    System.out.print("re ");
                }
                case MI -> {
                    System.out.print("mi ");
                }
                case FA -> {
                    System.out.print("fa ");
                }
                case SOL -> {
                    System.out.print("sol ");
                }
                case LA -> {
                    System.out.print("la ");
                }
                case SI -> {
                    System.out.print("si ");
                }
                case SALIR -> {
                    System.out.println("");
                }
                case default -> {
                }
            }
        }
    }


}

    }
}
