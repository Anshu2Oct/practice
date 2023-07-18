package demo;

import java.util.Scanner;

public class InformationApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the App :");

        // Wait 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = sc.nextLine();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter your age :");
        int age = sc.nextInt();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter your salary :");
        double salary = sc.nextDouble();


        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Thank You for the information..! ");

    }
}
