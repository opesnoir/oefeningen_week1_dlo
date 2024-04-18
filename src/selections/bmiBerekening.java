package selections;
//Schrijf een applicatie die het volgende doet:
/*Vraag de lengte van een persoon in centimeters en lees deze in. Vraag vervolgens het gewicht van
deze persoon in kilogram en lees deze in. Bereken hierna de BMI van deze persoon en druk deze af*/

//naam: M. Ci

import java.util.Scanner;

public class bmiBerekening {

    //functie bmi berekenen
    public static double bmiBerekenen(int lengteInput, double gewichtInput){
        double lengteInMeters = (lengteInput/100.0);

        return gewichtInput / (lengteInMeters*lengteInMeters);
    }

    //functie bmi conclusie
    public static void messageBmiHealth(double uitkomstBmi){
        if (uitkomstBmi < 25){
            System.out.println("Je bent goed op gewicht.");
        } else System.out.println("Je bent te zwaar.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengteInput;
        double gewichtInput;
        double uitkomstBmi;

        System.out.println("Geef je lengte in centimeters: ");
        lengteInput = input.nextInt();
        System.out.println("Geef je gewicht in kilogram :");
        gewichtInput = input.nextDouble();
        uitkomstBmi = bmiBerekenen(lengteInput,gewichtInput);
        System.out.println("Jouw BMI is: " + uitkomstBmi);
        messageBmiHealth(uitkomstBmi);

    }
}
