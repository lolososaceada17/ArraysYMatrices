package Arrays;

/* Soluciona el siguiente problema del anterior boletín utilizando arrays. Creaun
programaquecree6000númerosaleatoriosde0a100(usaunaconstanteparafijar
este número).
Muestra:
● La media de los números leídos.
● El dígito en el que más números terminan.
● En qué dígitos no ha terminado ningún número.
● Cuántos números terminan en cada uno de los dígitos (0 .. 9).
● Calculaaqué%del total denúmeroscreadosequivalecadaelementodel
punto anterior.
● Calculat ambién la suma tota lde todos los porcentajes calculados y lamedia
de porcentajes para lo svalores contados (es decir, la suma de todos los
porcentajes entre 6 (los valores 0, 1, 2, 3, 4 y 5))
Pruebaacambiarel valorde laconstanteparacrearmuchosmásnúmeros,como
60.000, yhazlodenuevoparacrearmuypocos,como20,o100.¿Quéocurrecon
los porcentajes?¿Se repite cadanúmerouna cantidadde veces similar?¿Qué
diferencia existe entre crear pocos y muchos números?
Ejemplo de ejecución:
El nº 0 se ha repetido 1017 veces. Esto equivale a un 16,95%
El nº 1 se ha repetido 990 veces. Esto equivale a un 16,50%
El nº 2 se ha repetido 994 veces. Esto equivale a un 16,57%
El nº 3 se ha repetido 998 veces. Esto equivale a un 16,63%
El nº 4 se ha repetido 1017 veces. Esto equivale a un 16,95%
El nº 5 se ha repetido 984 veces. Esto equivale a un 16,40%
Lasumadetodoslosporcentajesesequivalenteal100.00%.El%medioparacada
contador es de 16,67%. */

public class Ejercicio4Arrays {
    static final int Tamano = 6000;


    public static void main(String[] args) {


        int[] numeros = new int[Tamano];
        rellenaAleatoreos(numeros);



    }

    private static void rellenaAleatoreos(int[] arrays) {
        for (int i = 0; i < arrays.length; i ++) {
            arrays[i] = (int) (Math.random() * 101);
        }

    }

    private static double media (int[] arrays){

        double media = 0;

        for (int i = 0; i< arrays.length; i++){

            media+= arrays[1];
        }

        return media/arrays.length;


    }

    private static void digitoEnElQueMasNumerosTerminan(int[] arrays){

        int[] repeticionTerminaciones = new int[10];

        for (int i = 0; i< arrays.length; i++){

            int digitoTermina = arrays[i] % 10;
            

        }

    }
}
