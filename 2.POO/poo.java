/**
 * poo
 */
public class poo {
    public static void main(String args[]){

    }

    public static void menu() {
        boolean c = true;
        Scanner menuScanner = new Scanner(System.in);
        while (c) {
            System.out.println("===================================");
            System.out.println("Menu de opciones:");
            System.out.println("0) Salir");
            System.out.println("1) Hola mundo en java");
            System.out.println("2) Clase persona");
            System.out.println("3) Computadoras");
            System.out.println("4) Alumno");
            System.out.println("5) Medicos");
            System.out.println("6) Relciones");
            System.out.println("7) Metodos sobrecargados");
            System.out.println("8) Paquetes en java");
            System.out.println("9) ejercicios");
            System.out.println("10) metodo ToString");

            // https://javadesdecero.es/basico/operadores-en-java-ejemplos/#1_Operadores_aritmeticos

            System.out.println("============================================" + ANSI_GREEN);

            switch (menuScanner.nextInt()) {
            case 0:
                System.out.println(ANSI_RED + "Adios.... :c");
                System.exit(0);
                break;
            case 1:
                soonPart();
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
            case 6:
                soonPart();
                break;
            case 7:
                soonPart();
                break;
            case 8:
                soonPart();
                break;
            case 9:
                soonPart();
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