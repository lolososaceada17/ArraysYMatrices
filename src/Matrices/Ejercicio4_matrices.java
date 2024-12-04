package Matrices;

public class Ejercicio4_matrices {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        matrizLineaInviertida(matriz);
    }

    private static void matrizLineaInviertida(int[][] matriz2) {

        String cadenas = "";

        for (int i = matriz2.length - 1; i >= 0; i--) {

            for (int j = matriz2[i].length - 1; j >= 0; j--) {


                cadenas+= matriz2[i][j];

            }
        }

        System.out.println(cadenas);
    }

}
