/**
 * Cliente
 */
public class Cliente {

    private String nombre;
    private String empresa;
    private int añosExperiencia;


    public Cliente() {
    }


    public Cliente(String nombre, String empresa, int añosExperiencia) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    
}