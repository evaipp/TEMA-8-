
public class Lista {
    Entero[] tabla;

    lista pública () {
       tabla = nuevo  entero [ 0 ];
   }

   void  insertarPrincipio ( Integer  nuevo ) {
       tabla = arreglos . copyOf ( tabla , tabla . longitud + 1 );
       sistema _ arraycopy ( tabla , 0 , tabla , 1 , tabla . longitud - 1 );
       tabla [ 0 ] = nuevo ;
   }

    void insertarFinal(Integer nuevo) {
        tabla = arreglos.copyOf(tabla, tabla.longitud + 1);
        tabla[tabla.longitud - 1] = nuevo;

    }

   void  insertarFinal ( Lista  otraLista ) {
       int  taminio = tabla . longitud ;
       tabla = arreglos . copyOf ( tabla , tabla . longitud + otraLista . tabla . longitud );
       sistema _ arraycopy ( otraLista . tabla , 0 , tabla , taminio , otraLista . tabla . length );
   }

   void  insertar ( int  posicion , Integer  nuevo ) {
       tabla = arreglos . copyOf ( tabla , tabla . longitud + 1 );
       sistema _ arraycopy ( tabla , posicion , tabla , posicion + 1 , tabla . length - posicion - 1 );
       tabla [ posicion ] = nuevo ;
   }

    Eliminar entero ( índice int  ) {
       Entero  eliminado = nulo ;
       if ( índice >= 0 && índice < tabla . longitud ) {
           eliminado = tabla [ índice ];
           for ( int  i = índice ; i < tabla . longitud - 1 ; i ++) {
               tabla [ i ] = tabla [ i + 1 ];
           }
           tabla = arreglos . copyOf ( tabla , tabla . longitud - 1 );
       }
       volver  eliminado ;
   }

   int  buscar ( Integer  claveBusqueda ) {
        índice int = - 1 ;
       for ( int  i = 0 ; i < tabla . longitud && índice == - 1 ; i ++) {
           if ( tabla [ i ].

    igual a ( claveBusqueda )) {
               índice = yo ;
           }
       }

    índice de retorno;
   }

   public  int  numeroElementos () {
       volver  tabla . longitud ;
   }

   public  void  toString () {
       sistema _ fuera _ println ( "Lista:" + Arreglos . aString ( tabla ));
   }
}
