package Matrices;

import java.util.Scanner;

public class Ejercicio7_Matrices {

    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        int[][] matriz2 = {{11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

        comparaDimensiones(matriz1, matriz2);

        comparaDatosIntroducidos(matriz1,matriz2);

    }

    private static void comparaDimensiones(int[][] matriz1_1, int[][] matriz2_2) {

        if (matriz1_1.length == matriz2_2.length) {

            System.out.println("la dimensión de filas es simétrica ");

        } else System.out.println("la dimensión de filas es asimétrica ");

        for (int j = 0; j < matriz1_1.length; j++) {

            if (matriz1_1[j] == matriz2_2[j]) {

                System.out.println("la dimensión de columnas son simétricas ");

            } else System.out.println("la dimensión de columnas son asimétricas ");


        }

    }

    private static void comparaDatosIntroducidos(int[][] matriz2_1, int[][] matriz2_2){

        for (int i = 0 ; i < matriz2_1.length ; i++){

            for (int j = 0 ; j < matriz2_2.length; j++ );
        }



    }
}
