package DegreeCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DegreeCalculator {

    double celsiusTemperature;
    double fahrenheitTemperature;

    public static void main(String[] args) {

        DegreeCalculator calculator = new DegreeCalculator();
        calculator.getInput();
        calculator.convertToFahrenheit();
        calculator.checkForCoat();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;


        while (!validInput) {
            System.out.print("Enter the temperature in Celsius: ");
            try{
                celsiusTemperature = scanner.nextDouble();
                if(celsiusTemperature >= 0 && celsiusTemperature <= 40) {
                    validInput = true;
                }else{
                    System.out.println("Invalid input");
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a numeric value. ");
                scanner.next();
            }


        }
    }

    public void convertToFahrenheit(){
        fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

        }

    public void checkForCoat(){
            System.out.println("Temperature in fahrenheit: " + fahrenheitTemperature);
            if(fahrenheitTemperature < 50){
                System.out.println("You need a coat");
            }else{
                System.out.println("You do not need a coat");
            }

        }
    }

