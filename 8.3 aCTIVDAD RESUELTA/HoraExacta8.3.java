
public class HoraExacta extends Hora {
    HoraExacta(int hora, int minutos) {
        super(hora, minutos);
        // TODO Auto-generated constructor stub
    }

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        this.segundos = segundo;
    }

    int segundos;
    public boolean equals(Object o) {

        HoraExacta otroReloj = (HoraExacta) o;

        boolean iguales;
        if (this.hora == otroReloj.hora
                && this.minutos == otroReloj.minutos
                && this.segundos == otroReloj.segundos) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;

    }
}
