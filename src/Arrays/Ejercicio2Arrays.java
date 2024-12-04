package Arrays;

public class Ejercicio2Arrays {

    public static void main(String[] args) {
        int[] numeros = {-1,2,-3,4,-5,3,-7};
        int contar =0;

        for (int i=0;i< numeros.length;i++){

            if (numeros[i]<0){
                contar++;
            }
        }

        System.out.println("los elemtos negativos son" +contar);
    }
}
