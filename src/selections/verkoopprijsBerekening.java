package selections;
// applicatie werking
/*Schrijf een applicatie die de verkoopprijs berekent van een product. De verkoopprijs wordt berekend op
basis van de inkoopprijs van een product en de winstmarge.*/
// huidige schrijfstijl switch
/*        int btwHoog = 21;
                int btwLaag = 9;
                double inclusiefBtwHoog = 1.21;
                double inclusiefBtwLaag = 1.09;

                switch (btwKeuze) {
                case 1 -> {
                double totaalbedrag = (inclusiefBtwHoog * berekendeVerkoopprijs);
                System.out.println("De verkoopprijs inclusief " + btwHoog + "% BTW : " + totaalbedrag);
                }
                case 2 -> {
                double totaalbedragLaag = (inclusiefBtwLaag * berekendeVerkoopprijs);
                System.out.println("De verkoopprijs inclusief " + btwLaag + "% BTW : " + totaalbedragLaag);
                }
default -> System.out.println("Ongeldige keus, kies 1 of 2.");
        }*/
// oude schrijfstijl switch
/*    //oude schrijfstijl switch
        switch (btwKeuze){
            case 1: double totaalbedrag = (inclusiefBtwHoog * berekendeVerkoopprijs);
                System.out.println("De verkoopprijs inclusief " + btwHoog + "% BTW : " + totaalbedrag);
                break;
            case 2: double totaalbedragLaag = (inclusiefBtwLaag * berekendeVerkoopprijs);
                System.out.println("De verkoopprijs inclusief " + btwLaag + "% BTW : " + totaalbedragLaag);
                break;
            default:
                System.out.println("Ongeldige keus, kies 1 of 2.");
        }*/
//naam: M. Ci

import java.util.Scanner;

public class verkoopprijsBerekening {

    public static double verkoopprijsZonderBtw(double inkoopprijs, int winstmarge) {
        return (((inkoopprijs * winstmarge) / 100.0) + inkoopprijs);
    }
    public static void vraagBtwKeus() {
        System.out.println("Onder welk BTW-tarief valt het product?");
        System.out.println("      1 Hoog");
        System.out.println("      2 Laag");
        System.out.println("Geef je keuze: ");
    }
    public static void verkoopprijsInclusiefBtw(int btwKeuze, double berekendeVerkoopprijs) {
        //variabelen
        int btwHoog = 21;
        int btwLaag = 9;
        double inclusiefBtwHoog = 1.21;
        double inclusiefBtwLaag = 1.09;

        switch (btwKeuze) {
            case 1 -> {
                double totaalbedrag = (inclusiefBtwHoog * berekendeVerkoopprijs);
                System.out.println("De verkoopprijs inclusief " + btwHoog + "% BTW : " + totaalbedrag);
            }
            case 2 -> {
                double totaalbedragLaag = (inclusiefBtwLaag * berekendeVerkoopprijs);
                System.out.println("De verkoopprijs inclusief " + btwLaag + "% BTW : " + totaalbedragLaag);
            }
            default -> System.out.println("Ongeldige keus, kies 1 of 2.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inkoopprijs;
        int winstmarge;
        int btwKeuze;
        double berekendeVerkoopprijs;

        System.out.println("Inkoopprijs (met een komma de euro's van de centen scheiden): ");
        inkoopprijs = input.nextDouble();
        System.out.println("Winstmarge in %: ");
        winstmarge = input.nextInt();
        berekendeVerkoopprijs = verkoopprijsZonderBtw(inkoopprijs, winstmarge); // berekening verkoopprijs excl. btw met parameters
        System.out.println("De verkoopprijs exclusief BTW: " + berekendeVerkoopprijs);

        vraagBtwKeus(); // vragen btw hoog of laag
        btwKeuze = input.nextInt(); // gebruikersinput opslag btw keuze

        verkoopprijsInclusiefBtw(btwKeuze, berekendeVerkoopprijs); // berekening verkoopprijs incl. btw met parameters

    }
}
