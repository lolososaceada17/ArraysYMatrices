package Arrays;

import java.util.Scanner;

/* Ejercicio:
  Crea un programa que pregunte cuántos elementos tendremos en un array de
enteros. Posteriormente se preguntarán tantos números como haya indicado el
usuario. Posteriormente, mostraremos por pantalla el mayor,el menor y la media.Si
el número mayor o menor están repetidos,deberá indicarse cuántas veces se repite.
Por ejemplo:
Introduzca las posiciones que tendrá el array: 5
Introduzca el número 1: 4
Introduzca el número 2: -1
Introduzca el número 3: 9
Introduzca el número 4: 5
Introduzca el número 5: 9

El mayor número introducido es 9 (se repite 2 veces)
El menor número introducido es -1
La media de los números introducidos es: 5.2
 */

public class Ejercicio3Arrays {

    public static void main(String[] args) {

        int cantidadNumeros;// creo la variable que son los arrays que el receptor desea introducir.


        Scanner entrada = new Scanner(System.in);// Abro el scanner


        System.out.println("¿Cuántos números deseas introducir? ");

        cantidadNumeros = entrada.nextInt(); // el receptor dice cuantos números desea introducir.

        int[] numerosIntroducidos = new int[cantidadNumeros];//comienza el array.

        for (int i = 0; i < cantidadNumeros; i++) {

            System.out.print(" Dime el numero deseado " + (i + 1));//se introduce el numero que se guarda en el array

            numerosIntroducidos[i] = entrada.nextInt();//el número se guarda en el array.
        }

        entrada.close();// cierre de scanner

        int numeroMayor = numerosIntroducidos[0];// se introduce una variable en 0 para averiguar el mayor

        int numeroMenor = numerosIntroducidos[0];// se introduce una variable en 0 para averiguar el menor.

        for (int i = 1; i < numerosIntroducidos.length; i++) {

            if (numerosIntroducidos[i] > numeroMayor) {

                numeroMayor = numerosIntroducidos[i];
                /* si el numero que se encuentra en el array en la posición "i" es mayor que la variable
                numero mayor, la variable mayor es igual a numerosIntroducidos en la posición "i".
                 */
            }

            if (numerosIntroducidos[i] < numeroMenor) {

                numeroMenor = numerosIntroducidos[i];

                /* si el numero que se encuentra en el array en la posición "i" es mayor que la variable
                numero mayor, la variable mayor es igual a numerosIntroducidos en la posición "i".*/


            }

        }

        int contador = 0;

        int contador2 = 0;

        for (int i = 0; i < cantidadNumeros; i++) {

            if (numeroMayor == numerosIntroducidos[i]) {

                contador++;
            }

            if (numeroMenor == numerosIntroducidos[i]) {

                contador2++;
            }
        }


        System.out.println("el numero Mayor es " + numeroMayor + " y se repite " + contador);

        System.out.println("el numero Menor es " + numeroMenor + " y se repite " + contador2);

        float suma = 0;

        for (int i = 0; i < cantidadNumeros; i++) {

            suma += numerosIntroducidos[i];
        }

        float media;
        media = suma / cantidadNumeros;

        System.out.println("la media es " + media);


    }
}
