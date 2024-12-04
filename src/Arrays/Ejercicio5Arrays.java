package Arrays;

public class Ejercicio5Arrays {
    private static void generarArrayAleatorio(int tamano) {
        // Crear un array de enteros del tamaño especificado
        int[] arrayAleatorio = new int[tamano];

        // Llenar el array con números aleatorios de 0 a 1000
        for (int i = 0; i < tamano; i++) {
            arrayAleatorio[i] = (int) (Math.random() * 1001); // Escalamos a 0-1000
        }

        // Mostrar el array por pantalla
        System.out.print("Array aleatorio: ");
        for (int i = 0; i < arrayAleatorio.length; i++) {
            System.out.print(arrayAleatorio[i] + " ");
        }
        System.out.println();
    }

    private static void tamanoDeseaso(String[] args) {
        int tamano = 5;
        generarArrayAleatorio(tamano);
    }
}
