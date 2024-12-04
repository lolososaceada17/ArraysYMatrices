package Arrays;

import java.util.Arrays;

public class Ejercicio1Arrays {

    public static void main(String[] args) {

        int[] nunmeros ={2,3,4,5,6};
        int suma = 0;

        for (int i = 0 ; i<nunmeros.length; i++ ){

            if (i%2 ==0){
                suma+=nunmeros[i];
            }
        }

        System.out.println("la suma de los elementos es " +suma);

        System.out.println("la vida es bella");
    }

}
