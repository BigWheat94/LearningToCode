package DegreeCalculator;

import java.util.Scanner;

public class DegreeCalc2 {

    public static void main(String[] args) {

        DegreeCalc2 demo = new DegreeCalc2();

        int userInput = demo.getUserInput();
        double fahrenheit = demo.convertToFahrenheit(userInput);
        demo.checkForCoat(fahrenheit);


    }

    public int getUserInput(){
        Scanner sc = new Scanner(System.in);
        int userInput;

        while(true){
            System.out.print("Enter the temperature in Celsius: ");

            if(sc.hasNextInt()){
                userInput = sc.nextInt();

                if(isValidCelsiusTemp(userInput)){
                    break;
                }else{
                    System.out.println("Please enter a numeric value between 0 and 40 " +
                            "for Celsius temperature: ");
                }
            }else{
                System.out.println("Invalid input. Please enter a numeric value: ");
                sc.next();

            }
        }


        sc.close();
        return userInput;

    }

    public double convertToFahrenheit(int celsiusTemperature){
        return (celsiusTemperature * 9 / 5.0) + 32;

    }

    public void checkForCoat(double fahrenheit){
        if(isCoatNeeded(fahrenheit)){
            System.out.println("You need a coat");
        }else{
            System.out.println("You do not need a coat");
        }

    }

    public boolean isCoatNeeded(double fahrenheit){
        return fahrenheit < 50;
    }

    public boolean isValidCelsiusTemp(int celsiusTemp){
        return celsiusTemp >= 0 && celsiusTemp <= 40;
    }
}
