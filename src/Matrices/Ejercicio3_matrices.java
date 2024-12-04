package Matrices;

public class Ejercicio3_matrices {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        imprimeLinea(matriz);
    }

    private static void imprimeLinea(int[][] matriz2) {

        String cadenas = "";

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2[i].length; j++) {


                cadenas += matriz2[i][j];


            }

        }
        System.out.println(cadenas);
    }
}
