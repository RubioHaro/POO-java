import java.util.Scanner;

public class Operadores {

    /* Colores de la consola */
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("* RUBIO HARO LEARNING  *");
        System.out.println("************************");
        menu();
    }

    public static void menu() {
        boolean c = true;
        Scanner menuScanner = new Scanner(System.in);
        while (c) {
            System.out.println("===================================");
            System.out.println("Menu de opciones:");
            System.out.println("0) Salir");
            System.out.println("1) Operadores aritméticos");
            System.out.println("2) Operadores unarios");
            System.out.println("3) Operador de asignación");
            System.out.println("4) Operadores relacionales");
            System.out.println("5) Operadores unarios");

            // https://javadesdecero.es/basico/operadores-en-java-ejemplos/#1_Operadores_aritmeticos
            // Operadores lógicos
            // Operador ternario
            // Operadores bit a bit
            // Operadores shift
            // Operador de instancia
            // Precedencia y Asociatividad de Operadores

            System.out.println("============================================" + ANSI_GREEN);

            switch (menuScanner.nextInt()) {
            case 0:
                System.out.println(ANSI_RED + "Adios.... :c");
                System.exit(0);
                break;
            case 1:
                aritmeticos();
                break;
            case 2:
                soonPart();
                break;
            case 3:
                soonPart();
                break;
            case 4:
                soonPart();
                break;
            case 5:
                soonPart();
                break;
            default:
                System.out.println(ANSI_RED + "No se ha seleccionado una opcion valida  >:c" + ANSI_RESET);
                break;
            }
        }
        menuScanner.close();
    }

    public static void aritmeticos() {
        String definition = ANSI_YELLOW
                + "Se utilizan para realizar operaciones aritmeticas simples en tipos de datos primitivos. Y suelen ser las más similiares entre los lenguajes de programación."
                + ANSI_RESET;
        System.out.println(definition);
        System.out.println("Suma: 5 + 4 = " + 5 + 4);
        System.out.println("Resta: 5 - 4 = " + (5 - 4));
        System.out.println("Multiplicacion: 5 * 4 = " + 5 * 4);
        System.out.println("Division: 5 / 4 = " + 5 / 4);
        System.out.println("Modulo: 5 % 4 = " + 5 % 4);

    }

    public static void soonPart() {
        String message = ANSI_YELLOW + "Por agregar.... :c" + ANSI_RESET;
        try {
            System.out.println(message);
            Thread.sleep(2500);
        } catch (InterruptedException exception) {
            System.out.println(ANSI_RED + "Ha ocurrido un error");
        }

    }

}