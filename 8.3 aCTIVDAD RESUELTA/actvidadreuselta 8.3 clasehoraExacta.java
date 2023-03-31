
public class HoraExacta {

    public HoraExacta(int i, int j, int k) {
    }
    HoraExacta otroReloj = (HoraExacta) 0;
    
    boolean iguales;
    if (this.hora == otroReloj.hora 
            && this.minuto == otroReloj.minuto
            && this.segundo == otroReloj.segundo) {
             iguales = true;
        } else {
            iguales = false;
        }
        return iguales;{}
}




    





  /*   public boolean equals(Object obj) {
        HoraExacta otroReloj = (HoraExacta) obj;
        boolean iguales;
        if (this.hora == otroReloj.hora
                && this.minuto == otroReloj.minuto
                && this.segundo == otroReloj.segundo) {

            iguales = true;
        } else {
            iguales = false;

        }
        return iguales;

        
    }*/

