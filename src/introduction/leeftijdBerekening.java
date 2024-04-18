package introduction;
//Applicatie doet het volgende:
/*Vraag de naam van een persoon en lees deze in. Vraag vervolgens het geboortejaar van deze
persoon en lees deze in. Bereken hierna de leeftijd van deze persoon en druk deze af*/
//naam: M. C.

import java.time.Year;
import java.util.Scanner;

public class leeftijdBerekening {

    //functie leeftijd berekenen aan de hand van het geboortejaar
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
        nameInput = input.next();
        System.out.println("Wat is je geboortejaar?");
        birthYearInput = input.nextInt();
        calculatedAge = returnAge(birthYearInput); // gebruik de functie returnAge en geef de leeftijd input uit de scanner mee
        System.out.println("Beste " + nameInput + ", je leeftijd is: " + calculatedAge);

    }
}
