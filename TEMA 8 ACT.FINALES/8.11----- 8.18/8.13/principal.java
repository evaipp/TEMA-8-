public class Principal {
    clase  pública Principal
    {

    public  static  void  main ( String [] args ) {
            CajaCarton  caja1 =

    nueva  CajaCarton ( 10 , 20 , 30 , Unidad . CM );
            sistema _ fuera _ println ( "Caja 1: " + caja1 );
            sistema _ fuera _ println ( "Volumen de caja 1: " + caja1 . getVolumen ());
            CajaCarton  caja2 =

    nueva  CajaCarton ( 5 , 10 , 15 , Unidad . M );
            caja2 . setEtiqueta ( "Caja frágil" );
            sistema _ fuera _ println ( "Caja 2: " + caja2 );
            sistema _ fuera _ println ( "Volumen de caja 2: " + caja2 . getVolumen ());
            sistema _ fuera _ println ( "El consumo de carton es " + ( caja1 . getSuperficieTotal () + caja2 . getSuperficieTotal ()) + " cm cuadrados " );
        }
}}
