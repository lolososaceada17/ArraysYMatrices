package Arrays;

import java.util.Scanner;

public class Ejercicio6Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt(); // Leer el tamaño del array

        // Crear un array de enteros con el tamaño especificado
        int[] array = new int[tamaño];

        // Llenar el array con números aleatorios
        for (int i = 0; i < tamaño; i++) {
            // Generar un número aleatorio entre 0 y 100
            array[i] = (int) (Math.random() * 101);
        }

        // Mostrar el array generado
        System.out.println("Array generado:");
        for (int num : array) {
            // Imprimir cada número en el array
            System.out.print(num + " ");
        }
        System.out.println();

        // Pedir al usuario que ingrese el número que quiere buscar
        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscado = scanner.nextInt();

        // Variable para saber si el número fue encontrado
        boolean encontrado = false;

        // Comprobar si el número está en el array
        for (int num : array) {
            if (num == elementoBuscado) {
                encontrado = true; // Cambiar a verdadero si se encuentra
                break; // Salir del bucle
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en el array.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el array.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}