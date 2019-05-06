/**
 * Persona
 */
public class Persona {
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param imp la impresora a encender
     */
    public void encenderImpresora(Impresora imp) {
        String m;
        if (imp.isPrendida()) {
            m = "ya se encuentra prendida";
        } else {
            imp.setPrendida(true);
            m = "prendida";
        }
        System.out.println(imp.getNombre() + ": " + m);
    }

    /**
     * @param imp la impresora a apagar
     */
    public void apagarImpresora(Impresora imp) {
        String m;
        if (!imp.isPrendida()) {
            m = "ya se encuentra apagada";
        } else {
            imp.setPrendida(false);
            m = "apagada";
        }
        System.out.println(imp.getNombre() + ": " + m);
    }

    public void imprimirDocumento(Impresora imp, Documento d) {
        System.out.println(this.nombre + ": Imprimiendo " + d.getNombre() + ".doc en " + imp.getNombre());
        System.out.println("**************************************************");
        System.out.println(d.getTexto());
        System.out.println("**************************************************");
    }
}