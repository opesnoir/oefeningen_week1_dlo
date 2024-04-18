package introduction;
//Applicatie doet het volgende:
/*Vraag de naam van een persoon en lees deze in. Vraag vervolgens het geboortejaar van deze
persoon en lees deze in. Bereken hierna de leeftijd van deze persoon en druk deze af*/
//naam: M. C.

import java.time.Year;
import java.util.Scanner;

public class leeftijdBerekening {

    //functie leeftijd berekenen aan de hand van het geboortejaar, gebruikers input [birthyearinput] wordt als parameter doorgegeven aan de functie.
    public static int returnAge(int birthYearInput) {
        int currentYear = Year.now().getValue();

        return (currentYear - birthYearInput);
    }


    public static void main(String[] args) {
        //variabelen
        Scanner input = new Scanner(System.in);
        String nameInput;
        int birthYearInput;
        int calculatedAge;

        System.out.println("Hoe heet je?");
        nameInput = input.next(); //gebruikers input ophalen met scanner [input], vervolgens opslaan in variabel [nameInput]
        System.out.println("Wat is je geboortejaar?");
        birthYearInput = input.nextInt(); //gebruikers input ophalen met scanner [input], vervolgens opslaan in variabel [birthYearInput]
        calculatedAge = returnAge(birthYearInput); //functie[returnage] aanroepen en gebruikersinput [birthyearinput] meegeven, de return opslaan [calculatedAge] om elders te gebruiken
        System.out.println("Beste " + nameInput + " geboren in het jaar " + birthYearInput + ", je leeftijd is: " + calculatedAge);

    }
}
