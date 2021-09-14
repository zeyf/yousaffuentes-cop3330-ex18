/* yousaffuentes-cop3330-ex18
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 zain yousaffuentes
 */


import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Press C to convert from Farenheit to Celsius.\nPress F to convert from Celsius to Farenheit.");

        char conversionTypeInput = s.next().charAt(0);
        double calculation = 0;
        int type = 0; // -1 is f or F // 1 is c or C
        if (conversionTypeInput == 'c' || conversionTypeInput == 'C') {
            type = 1;
        } else if (conversionTypeInput == 'f' || conversionTypeInput == 'F') {
            type = -1;
            int tempInCelsius = s.nextInt();
            calculation += (tempInCelsius * 9 / 5) + 32;
        } else
            return;

        System.out.println(
                type == -1 ?
                        String.format("Your choice: %c\nPlease enter the temperature in Celsius: ", conversionTypeInput)
                        :
                        String.format("Your choice: %c\nPlease enter the temperature in Farenheit: ", conversionTypeInput)
        );

        if (type == 1) {
            int tempInFarenheit = s.nextInt();
            calculation += (tempInFarenheit - 32) * 5 / 9;
        } else {
            int tempInCelsius = s.nextInt();
            calculation += (tempInCelsius * 9 / 5) + 32;
        };

        System.out.println(
                type == 1 ?
                        String.format("The temperature in Celsius is %.0f", calculation)
                        :
                        String.format("The temperature in Farenheit is %.0f", calculation)
        );


    }
}
