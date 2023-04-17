package org.desafio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        boolean pertence = false;
        while (c <= num) {
            if (c == num) {
                pertence = true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        sc.close();
    }
}
