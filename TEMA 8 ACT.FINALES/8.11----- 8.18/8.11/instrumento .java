public class instrumento  {
    Class Instrumento

import java.util.Arrays;

public abstract class Instrumento {

    protected Nota[] melodia;

    public Instrumento() {
        melodia = new Nota[0];
    }

    void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    abstract void interpretar();
}

}
