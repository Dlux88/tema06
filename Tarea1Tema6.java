//Desarrolla una aplicación que genere un array de 50 números aleatorios. El programa
//mostrará al usuario el siguiente menú hasta que éste pulse la opción ‘Salir’:
//• 1. Mostrar el array.
//• 2. Mostrar el array en orden inverso.
//• 3. Buscar el número menor.
//• 4. Buscar el número mayor.
//• 5. Comprobar si existe un número en el array.
//• 6. Cambiar el valor de un número.
//• 7. Cambiar dos números de posición.
//• 0. Salir


import java.util.Scanner;

public class Tarea1Tema6 {
    public static void main(String[] args) {

        int menu = 0;
        Scanner sc = new Scanner(System.in);
        int[] ArrayPrincipal = new int[51];

        do {

            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Mostrar el array.");
            System.out.println("2. Mostrar el array en orden inverso.");
            System.out.println("3. Buscar el número menor.");
            System.out.println("4. Buscar el número mayor.");
            System.out.println("5. Comprobar si existe un número en el array.");
            System.out.println("6. Cambiar el valor de un número.");
            System.out.println("7. Cambiar dos números de posición.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            menu = sc.nextInt();



            switch (menu) {
                case 1:
                    System.out.println("usted a elegido el numero 1");
                    rellenarArraysAleatorios(ArrayPrincipal, 0, 51);
                    MostrarArrays(ArrayPrincipal);
                    break;
                case 2:
                    System.out.println("usted a elegido el numero 2");
                    ArrayInverso(ArrayPrincipal);
                    break;
                case 3:
                    System.out.println("usted a elegido el numero 3");
                    NumeroMayor(ArrayPrincipal);
                    break;
                case 4:
                    System.out.println("usted a elegido el numero 4");
                    NumeroMenor(ArrayPrincipal);
                    break;
                case 5:
                    System.out.println("usted a elegido el numero 5");
                    NumeroIgual(ArrayPrincipal);
                    break;
                case 6:
                    System.out.println("usted a elegido el numero 6");
                    cambiarNumero(ArrayPrincipal);
                    break;
                case 7:
                    System.out.println("usted a elegido el numero 7");
                    break;
                default:
                    break;
            }
        } while (menu == 0);


    }


    public static int NumeroAleatorio(int minimo, int maximo) {


        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static void rellenarArraysAleatorios(int[] array, int minimo, int maximo) {

        for (int i = 0; i < array.length; i++) {
            array[i] = NumeroAleatorio(minimo, maximo);
        }
    }

    public static void MostrarArrays(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);

        }
    }

    public static void ArrayInverso(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = i;
            System.out.println(array[i]);

        }
    }

    public static int NumeroMayor(int[] array) {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {

            array[i] = i;
            if (array[i] < mayor) ;
            mayor = array[i];


        }
        System.out.println("el numero mayor es el:  " + mayor);

        return mayor;
    }


    public static int NumeroMenor(int[] array) {
        int menor = array[0];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {

            array[i] = i;
            if (menor > array[i]) ;
            array[i] = menor;
            menor = aux;


        }
        System.out.println("el numero menor es el:  " + aux);

        return menor;
    }

    public static void NumeroIgual(int[] array) {

        boolean existe = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero para saber si existe en la array");
        int numero = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (numero == array[i]) {
                existe = true;
            }

        }
        if (existe) {

            System.out.println("el numero existe dentro de la array y es el numero:  " + numero);


        } else {
            System.out.println("tu numero no existe prueba con otro: " + numero);
        }


    }

    public static int cambiarNumero(int[] array) {

        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * (0 - 51 + 1) + (0));

        System.out.println("Dime un numero y te devuelvo otro");
        int numero = sc.nextInt();
        for (int i = 0; i < array.length; i++) {


        }
        System.out.println(numeroAleatorio);
        return numeroAleatorio;

    }

}
