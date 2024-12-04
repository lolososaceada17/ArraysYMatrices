package Arrays;

import java.util.Scanner;

public class Ejercicio11Arrays {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
    }

    private static int[] inicializaArray1() {

        int tamanoArray1;

        System.out.println(" dime el tamaño del primer array ");

        tamanoArray1 = entrada.nextInt();

        int[] array1 = new int[tamanoArray1];

        for (int i = 0; i < tamanoArray1; i++) {

            System.out.print(" dime el numero deseado " + (1 + i));

            array1[i] = entrada.nextInt();

        }
        return array1;

    }

    private static int[] inicializaArray2() {

        int tamañoArray2;
        System.out.println(" dime el tamaño del segundo array  ");

        tamañoArray2 = entrada.nextInt();

        int[] array2 = new int[tamañoArray2];

        for (int i = 0; i < tamañoArray2; i++) {

            System.out.print(" dime el numero deseado " + (1 + i));

            array2[i] = entrada.nextInt();

        }
        return array2;
    }
}