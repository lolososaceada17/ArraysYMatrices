package Matrices;

public class Ejercicio8_Matrices {

    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        int[][] matriz2 = {{11, 12, 13, 14, 15,}, {16, 17, 18, 19, 20}};

        comparaDimensiones(matriz1,matriz2);

    }

    private static boolean comparaDimensiones (int[][] matriz1_1, int[][] matriz2_2){

        if (matriz1_1.length != matriz2_2.length);

        return false;


    }
}
