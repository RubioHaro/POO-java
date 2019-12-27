import java.util.Scanner;

/**
 * Principal
 */
public class Principal {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Documento doc = new Documento("Tesis",
                "Pogramacion orientada a objetos: uso y deshuso. Por rodrigo Rubio. 2019. Indice...");
        Scanner sc_imp = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        userRequest();
        System.out.print(ANSI_BLUE);
        Persona user = new Persona(sc.nextLine());
        System.out.println(ANSI_RESET);

        System.out.println(ANSI_GREEN + "Bienvenido " + user.getNombre() + "!" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "------------------------------" + ANSI_RESET);

        Impresora imp = printerRequest();
        String status;
        if (imp.isPrendida()) {
            status = "encendida";
        } else {
            status = "apagada";
        }
        System.out.println(imp.getNombre() + "(" + status + ")");

        boolean c;
        do {
            c = false;
            System.out.println(ANSI_YELLOW + "---------------------------------------" + ANSI_RESET);
            System.out.println("1) imprimir documento: tesis");
            System.out.println("2) apagar");
            System.out.print("Selecciona una opcion:");
            System.out.print(ANSI_BLUE);
            String opc = sc_imp.nextLine();
            System.out.println(ANSI_RESET);
            if (opc.equals("1")) {
                user.imprimirDocumento(imp, doc);
            } else if (opc.equals("2")) {
                user.apagarImpresora(imp);
            } else {
                c = true;
            }
        } while (c);
    }

    public static Impresora printerRequest() {
        System.out.println(ANSI_YELLOW + "------------------------------" + ANSI_RESET);
        Scanner sc_imp = new Scanner(System.in);
        System.out.println("Conectar nueva impresora");
        System.out.println("Nombre de la impresora:" + ANSI_BLUE);
        Impresora imp = new Impresora(sc_imp.nextLine());
        System.out.print(ANSI_RESET);
        imp.setPrendida(true);
        boolean c;
        do {
            c = false;
            System.out.println("Conectar por wifi o usb:");
            System.out.println("1) wifi");
            System.out.println("2) usb");
            System.out.print("Selecciona una opcion:" + ANSI_BLUE);
            String opc = sc_imp.nextLine();
            System.out.println(ANSI_RESET);
            if (opc.equals("1")) {
                imp.setWifi(true);
            } else if (opc.equals("2")) {
                imp.setUsb(true);
            } else {
                c = true;
            }
        } while (c);
        System.out.println(ANSI_YELLOW + "------------------------------");
        System.out.println(ANSI_RESET + "Impresora conectada: " + imp.getNombre());
        return imp;
    }

    public static void userRequest() {
        System.out.println(ANSI_YELLOW + "------------------------------");
        System.out.println("------Rubio Haro Rodrigo------");
        System.out.println("------------------------------" + ANSI_RESET);
        System.out.print("Ingresa tu nombre:");
    }

}