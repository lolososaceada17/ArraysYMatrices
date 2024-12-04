package Matrices;

public class Ejercicio16_Matrices {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7}, {0, 9, 8, 5, 4}};

        int[][] matrizAdyacentes = crearMatrizParesAdyacentes(matriz);

        for (int m = 0; m < matrizAdyacentes.length; m++) {

            for (int e = 0; e < matrizAdyacentes[0].length; e++) {

                System.out.print(matrizAdyacentes[m][e] + "  ");
            }
            System.out.println();
        }


    }

    private static int[][] crearMatrizParesAdyacentes(int[][] matriz2) {

        int[][] matrizAdyacentesPares = new int[matriz2.length][matriz2[0].length];

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2[0].length; j++) {

                matrizAdyacentesPares[i][j] = cuentaAdyacentesPares(matriz2, i, j);
            }
        }
        return matrizAdyacentesPares;
    }

    private static int cuentaAdyacentesPares(int[][] matrizOriginal, int i, int j) {

        int numerosPares = 0;

        for (int k = i - 1; k <= i + 1; k++) {

            for (int l = j - 1; l <= j + 1; l++) {

                if (k >= 0 && k < matrizOriginal.length && l >= 0 && l < matrizOriginal[0].length
                        && !(k == i || l == j)) {

                    if (matrizOriginal[k][l] % 2 == 0) {

                        numerosPares++;
                    }

                }


            }
        }

        return numerosPares;
    }
}
