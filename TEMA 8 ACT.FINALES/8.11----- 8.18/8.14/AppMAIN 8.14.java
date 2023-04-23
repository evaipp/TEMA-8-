public class App {
    public static void main(String[] args) throws Exception {
        Lista  l1 = nueva  Lista ();
        Lista  l2 = nueva  Lista ();
        l1 . insertarFinal ( 4 );
        l1 . insertarFinal ( 5 );
        l1 . insertarFinal ( 6 );
        l1 . toString ();
        l1 . insertarPrincipio ( 3 );
        l1 . insertarPrincipio ( 2 );
        l1 . insertarPrincipio ( 1 );
        l1 . toString ();
        l1 . insertar ( 2 , 99 );
        l1 . toString ();
        l1 . eliminar ( 2 );
        l1 . toString ();
        sistema _ fuera _ println ( l1 . buscar ( 4 ));
        l2 . insertarFinal ( 10 );
        l2 . insertarFinal ( 20 );
        l2 . insertarFinal ( 30 );
        l2 . insertarFinal ( 40 );
        l2 . insertarFinal ( 50 );
        l2 . toString ();
        l1 . insertarFinal ( 12 );
        l1 . toString ();

    }
}
