
public class piano extends Instrumento {

    public piano() {
        super();

    }

    /**
     * 
     */
    @Override
    public void interpretar() {
        for (Nota nota : melodia) {
            switch (nota) {
                case DO:
                    System.out.println("do");
                    break;
                case RE:
                    System.out.println("re");
                    break;
                case MI:
                    System.out.println("mi");
                    break;
                case FA:
                    System.out.println("fa");
                    break;
                case SOL:
                    System.out.println("sol");
                    break;
                case LA:
                    System.out.println("la");
                case SI:
                    System.out.println("si");
                    break;

            }
        }
        System.out.println("");
    }
}
