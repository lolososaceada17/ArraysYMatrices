package Arrays;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[] array = inicializaArray();
        rellenaArrayAleatorio(array);


    }

    private static int[] inicializaArray() {
        int tamanoArrays;

        Scanner entrada = new Scanner(System.in);
        System.out.println(" dime el tamaño del arrays ");
        tamanoArrays = entrada.nextInt();

        int[] arrays = new int[tamanoArrays];

        for (int i = 0; i < tamanoArrays; i++) {
            System.out.print(" dime el número deseado " + (i + 1));

            arrays[i] = entrada.nextInt();
        }

        return arrays;
    }

    private static void rellenaArrayAleatorio(int[] arrays) {

        for (int i = 0; i < arrays.length; i++){
            arrays[i] = (int) (Math.random()*101);
        }
    }
    private static void comprobaciónArrays(int[] arrays){

        for (int i = 0 ; i < arrays.length ; i++){
        }
    }


}
