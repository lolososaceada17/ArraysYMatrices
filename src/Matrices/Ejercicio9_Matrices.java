package Matrices;

public class Ejercicio9_Matrices {

    public static void main(String[] args) {

        int[][] matriz1 = {{1,2,3,4,5},{6,7,8,9,10},{26,27,28,29,30}};

        boolean comparar=comparaDimensiones(matriz1);
        System.out.println(comparar);


    }
    private static boolean comparaDimensiones(int [][] matriz2){


        for (int i = 0 ; i < matriz2.length; i++){

            for (int j = 0; j < matriz2[i].length; j++ ){

                if (matriz2[i][j]!=matriz2[matriz2.length-1-i][j]){

                    return false;
                }
            }
        }
        return true;
    }
}
