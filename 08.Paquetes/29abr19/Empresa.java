import cartera.clientes.*;
import RH.empleados.*;
import almacen.electrodomesticos.*;

/**
 * Empresa
 */
public class Empresa {

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

        System.out.println(ANSI_YELLOW + "*********************" + ANSI_RESET);
        System.out.println(ANSI_RED + "Rubio Haro Systems" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "*********************" + ANSI_RESET);

        Electricista e = new Electricista();
        Refrigerador r = new Refrigerador();
        Cliente c = new Cliente();

    }
}