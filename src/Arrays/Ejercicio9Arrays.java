package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9Arrays {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanoArray;


        System.out.println(" dime el  tamaño del array ");

        tamanoArray = entrada.nextInt();

        int[] array = new int[tamanoArray];

        for (int i = 0; i < tamanoArray; i++) {

            System.out.println(" dime el numero deseado " + (1 + i));

            array[i] = entrada.nextInt();

        }

        ordenaBurbuja(array);

        System.out.println(Arrays.toString(array));

    }

    public static void ordenaBurbuja(int[] array){
        int ayuda = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length-1-i; j++) {

                if (array[j] > array[j + 1]) {

                    ayuda = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = ayuda;
                }
            }

        }
    }

}
