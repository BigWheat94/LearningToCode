package GreetingUser;

import java.util.Scanner;

public class GreetingsUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //storing users name
        String name;

        System.out.println("What is your name? ");
        name = sc.nextLine();

        System.out.println("Hello " + name + "!");




    }//end main
}
