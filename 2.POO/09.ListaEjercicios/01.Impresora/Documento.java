/**
 * Documento
 */
public class Documento {
    private String nombre;
    private String texto;

    public Documento() {
    }

    public Documento(String nombre, String texto) {
        this.nombre = nombre;
        this.texto = texto;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }
}