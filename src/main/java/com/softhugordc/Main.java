package com.softhugordc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa el segundo numero:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Elige una opcion");
        System.out.println("a. Sumar");
        System.out.println("b. Restar");
        String option = scanner.nextLine().toLowerCase();
        switch (option) {
            case "a":
                System.out.println(firstNumber + secondNumber);
                break;
            case "b":
                System.out.println(firstNumber - secondNumber);
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

}