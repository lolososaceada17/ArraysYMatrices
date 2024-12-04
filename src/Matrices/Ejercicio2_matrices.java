package Matrices;

public class Ejercicio2_matrices {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        System.out.println(sumaNumeros(matriz));
    }

    private static int sumaNumeros(int[][] matriz2) {

        int suma = 0;

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                suma += matriz2[i][j];
            }
        }
        return suma;

    }
}
