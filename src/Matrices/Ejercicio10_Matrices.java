package Matrices;

public class Ejercicio10_Matrices {

    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {26, 27, 28, 29, 30}};

        boolean comparar = compruebaSimetriaEnY(matriz1);
        System.out.println(comparar);


    }

    private static boolean compruebaSimetriaEnY(int[][] matriz2) {


        for (int j = 0; j < matriz2[0].length/2; j++) {

            for (int i = 0; i < matriz2.length; i++) {

                if (matriz2[i][j] != matriz2[i][matriz2[i].length-1-j]) {

                    return false;
                }
            }
        }
        return true;
    }
}
