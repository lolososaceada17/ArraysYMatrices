package Arrays;

public class Ejercicio14Arrays {

    private static int[] cola;
    private static int numElementos = 0;
    private static int TAMAÑO = 5;

    public static void main(String[] args) {
        cola = new int[TAMAÑO];
        encolarElementos(7);
        encolarElementos(1);
        encolarElementos(4);
        encolarElementos(2);
        encolarElementos(5);
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
    }

    private static void encolarElementos2(int n) {


    }


    private static void encolarElementos(int n) {
        if (numElementos < TAMAÑO) {

            cola[numElementos++] = n;

        } else {

            System.out.println("la cola esta llena ");
        }

    }

    private static int desencolar() {

        int elemetosDevueltos = 0;

        if (numElementos == 0) {

            System.out.println("la cola esta vacía ");

        } else {

            elemetosDevueltos= cola[0];

            for (int i = 0; i < numElementos - 1; i++) {

                cola[i] = cola[i + 1];


            }

            numElementos--;
        }
        return elemetosDevueltos;
    }
}
