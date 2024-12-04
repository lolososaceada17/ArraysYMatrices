package Matrices;

public class Ejercicio6_Matrices {

    public static void main(String[] args) {

        int[] [] matriz = {{1,2,3,4,5},{6,7,8,9,10}};

        redacciónColumnasInvertidas(matriz);
    }

    private static void redacciónColumnasInvertidas (int [] [] array2){

        String devolución = " ";

        for (int j = array2[0].length -1 ; j >=0 ; j--){

            for (int i = array2.length -1 ; i >= 0 ; i--){

                devolución+= array2[i][j];
            }
        }
        System.out.println(devolución);
    }
}
