package org.desafio;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a string que deseja inverter: ");
        String original = scanner.nextLine();

        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
