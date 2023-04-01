package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matriz = new int[3][3];
            boolean iguales = true;

            // Pedir los números de la matriz
            System.out.println("Ingrese los 9 números del cubo:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            // Validar si los números son iguales
            int numero = matriz[0][0];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (matriz[i][j] != numero) {
                        iguales = false;
                        break;
                    }
                }
            }

            // Mostrar la matriz ordenada si los números son iguales
            if (iguales) {
                System.out.println("Si esta armado correctamente, los numeros son:");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        System.out.print(numero + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("No esta armado correctamente");
            }
        }
}