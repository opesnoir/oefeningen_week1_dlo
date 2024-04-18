package introduction;

// Dit programma toont een kerstgroet.
// Naam: M. Ci

public class Kerstgroet {

    public static void kerstBoom(){
        System.out.println( "     * ");
        System.out.println( "   * * * ");
        System.out.println( "    * * ");
        System.out.println( "  * * * * ");
        System.out.println( "   * * * ");
        System.out.println( " * * * * * ");
        System.out.println( "     *  ");
    }

    public static void kerstBoomLoop(){
        for (int i = 0; i < 7; i++) {
            System.out.println( "     * ");
            System.out.println( "   * * * ");
            System.out.println( "    * * ");
            System.out.println( "  * * * * ");
            System.out.println( "   * * * ");
            System.out.println( " * * * * * ");
            System.out.println( "     *  ");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //println start op een nieuwe regel en print zet zaken naast elkaar
        //methode 1
        System.out.println("Merry Christmas");
        System.out.println( "     * ");
        System.out.println( "   * * * ");
        System.out.println( "    * * ");
        System.out.println( "  * * * * ");
        System.out.println( "   * * * ");
        System.out.println( " * * * * * ");
        System.out.println( "     *  ");

        //methode 2 functie
        kerstBoom();
        kerstBoom();
        kerstBoom();
        kerstBoom();
        kerstBoom();
        kerstBoom();
        kerstBoom();

        //methode 3 loop
        kerstBoomLoop();
    }
}
