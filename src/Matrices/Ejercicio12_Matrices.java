package Matrices;

import java.util.Arrays;

public class Ejercicio12_Matrices {
    public static void main(String[] args) {

        int[][] matriz = {
                {12, 9, 1, 5},
                {18, 10, 4, 9},
                {19, 7, 1, 2},
                {11, 17, 3, 16}
        };

        boolean esCuadrada = matrizCuadrada(matriz);

        if (esCuadrada) {
            int[][] diagonalReflejo = transponerMatriz(matriz); // Cambiado el nombre para mayor claridad
            System.out.println("Matriz transpuesta (reflejo diagonal):");
            System.out.println(Arrays.deepToString(diagonalReflejo));
        } else {
            System.out.println("La matriz no es cuadrada.");
        }
    }

    private static boolean matrizCuadrada(int[][] matriz) {
        // Una matriz es cuadrada si el número de filas es igual al número de columnas
        for (int[] fila : matriz) {
            if (matriz.length != fila.length) {
                return false;
            }
        }
        return true;
    }

    private static int[][] transponerMatriz(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[j][i]; // Se intercambian índices para la transposición
            }
        }
        return resultado;
    }
}