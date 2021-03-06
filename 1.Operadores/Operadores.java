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
            System.out.println("5) Operadores lógicos");
            System.out.println("6) Operador ternario");
            System.out.println("7) Operadores bit a bit");
            System.out.println("8) Operadores shift");
            System.out.println("9) Operador de instancia");
            System.out.println("10) Precedencia y Asociatividad de Operadores");

            // https://javadesdecero.es/basico/operadores-en-java-ejemplos/#1_Operadores_aritmeticos

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
                unitarios();
                break;
            case 3:
                asignacion();
                break;
            case 4:
                relacionales();
                break;
            case 5:
                logicos();
                break;
            case 6:
                ternario();
                break;
            case 7:
                bitABit();
                break;
            case 8:
                shift();
                break;
            case 9:
                instancia();
                break;
            case 10:
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

    public static void unitarios() {
        int num = 5;
        String definition = ANSI_YELLOW
                + "Se utilizan para operar solamente un dato. Son usados para incrementar, disminuir o negar un valor."
                + ANSI_RESET;
        System.out.println(definition);
        System.out.println("Cambiar el signo de un numero: -(-5) = " + (-(-5)));
        System.out.println("Incrementar un valor en uno: ++: ++5 =" + (++num));
        System.out.println("Reducir un valor en uno: --" + num + " = " + (--num));
        System.out.println("Negar un valor, invierte un valor booleano: !true = " + !true);

    }

    public static void asignacion() {

        String definition = ANSI_YELLOW + "Este operador se usa para asignar un valor a cualquier variable."
                + "Tiene una asociación de derecha a izquierda, es decir, el valor dado en el lado derecho del operador se asigna a la variable de la izquierda y, por lo tanto, el valor del lado derecho debe declararse antes de usarlo o debe ser una constante."
                + ANSI_RESET;
        System.out.println(definition);
        System.out.println("int numero = 5 + 3");
        int numero = 5 + 3;
        System.out.println("numero =" + numero);
    }

    public static void relacionales() {

        String definition = ANSI_YELLOW
                + "Estos operadores siempre devulven un valor booleano, true o false (verdadero o falso), haciendo una comparación de expresiones. Se usan en estructuras de comparación."
                + ANSI_RESET;
        System.out.println(definition);
        System.out.println("Devuelve verdadero si el dato izquierdo es igual al derecho: 3 == 3? " + (3 == 3));
        System.out.println("Devuelve verdadero si el dato izquierdo NO es igual al derecho: 3 != 4? " + (3 != 4));
        System.out.println("Devuelve verdadero si el dato izquierdo es menor al derecho: 3 < 4? " + (3 < 4));
        System.out.println("Devuelve verdadero si el dato izquierdo es menor o igual al derecho: 3 <= 3? " + (3 <= 3));
        System.out.println("Devuelve verdadero si el dato izquierdo es mayor al derecho: 3 > 4? " + (3 > 4));
        System.out.println("Devuelve verdadero si el dato izquierdo es mayor o igual al derecho: 3 >= 4? " + (3 >= 4));
    }

    public static void logicos() {

        String definition = ANSI_YELLOW + "Sirven para realizar las operaciones lógicas 'AND' y 'OR'." + ANSI_RESET;
        System.out.println(definition);
        System.out.println("AND, devuelve verdadero cuando ambas condiciones son verdaderas. verdadero && falso ="
                + (true && false));
        System.out.println(
                "OR, devuelve verdadero si al menos una de las dos condiciones. verdadero || falso" + (true || false));
    }

    public static void ternario() {

        String definition = ANSI_YELLOW
                + "Sirve para abreviar la estructura if-else. Es llamado ternario debido a los tres operadores que contiene. \n condición ? if true : if false"
                + ANSI_RESET;
        System.out.println(definition);
        System.out.println("condicion = true");
        boolean condicion = true;
        System.out.println("(condicion)? true: false");
        System.out.println("resultado: " + ((condicion) ? true : false));
    }

    public static void bitABit() {

        String definition = ANSI_YELLOW
                + "Los operadores a nivel de bits se utilizan para realizar la manipulación de bits individuales de un número. Se pueden usar con cualquiera de los tipos enteros. Se utilizan al realizar operaciones de actualización y consulta de árbol indexado binario. Resultaran fáciles de entender si ya se conocen los operadores lógicos, puesto que es su aplicación en bits."
                + ANSI_RESET;
        System.out.println(definition);

        int a = 0x0005;
        int b = 0x0007;

        System.out.println("int a = 0x0005; \nint b = 0x0007;");

        // bitwise AND
        // 0101 & 0111=0101

        System.out.println(" a & b = " + (a & b));

        System.out.println(" 0101 & 0111=0101 \n");
        // bitwise or
        // 0101 | 0111=0111

        System.out.println(" a | b = " + (a | b));

        System.out.println(" 0101 | 0111=0111 \n");
        // bitwise xor
        // 0101 ^ 0111=0010

        System.out.println(" a ^ b = " + (a ^ b));

        System.out.println(" 0101 ^ 0111=0010 \n");
        // bitwise complemento
        // ~0101=1010

        System.out.println(" ~ a = " + ~a);

        System.out.println(" ~0101=1010 \n");
        // también se puede combinar con el
        // operador de asignación
        // a=a&b
        a &= b;
        System.out.println(" a = " + a);

    }

    public static void shift() {

        String definition = ANSI_YELLOW
                + "Los operadores shift de Java se usan para desplazar los bits de un número hacia la izquierda o hacia la derecha, multiplicando o dividiendo el número por dos, respectivamente. Se pueden usar cuando tenemos que multiplicar o dividir un número por dos."
                + ANSI_RESET;
        System.out.println(definition);

        int a = 0x0005;
        int b = -10;

        // operador de desplazamiento a la izquierda
        // 0000 0101<<2 =0001 0100(20)
        // similar a 5*(2^2)
        System.out.println("a<<2 = " + (a << 2));

        // operador de desplazamiento a la derecha
        // 0000 0101 >> 2 =0000 0001(1)
        // similar a 5/(2^2)
        System.out.println("a>>2 = " + (a >> 2));

        // operador de cambio a la derecha sin firmar
        System.out.println("b>>>2 = " + (b >>> 2));
    }

    static class Person {

    }

    static interface MyInterface {

    }

    static class Boy extends Person implements MyInterface {

    }

    public static void instancia() {

        String definition = ANSI_YELLOW
                + "El operador de instancia se usa para verificar el tipo. Se puede usar para probar si un objeto es una instancia de una clase, una subclase o una interfaz."
                + ANSI_RESET;
        System.out.println(definition);

        Person obj1 = new Person();
        Person obj2 = new Boy();

        // Como obj1 es de tipo Person, no es una
        // instancia de Boy o interfaz
        System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));

        // Dado que obj2 es de tipo Boy, cuya clase padre es
        // Person e implementa la interfaz Myinterface
        // es una instancia de todas estas clases
        System.out.println("obj2 instanceof Person: " + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: " + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
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