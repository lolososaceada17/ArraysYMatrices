package Matrices;

public class Ejercicio5_Matrices {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        redacciónColumnas(matriz);
    }

    private static void redacciónColumnas(int[][] matriz2) {

        String cadenas = "";

        for (int j = 0; j < matriz2[0].length; j++) {

            for (int i = 0; i < matriz2.length; i++) {


                cadenas += matriz2[i][j];
            }
        }

        System.out.println(cadenas);
    }
}
