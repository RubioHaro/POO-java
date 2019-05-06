public class Cuenta {

    private String fechaApertura;
    private String expira;
    private Cliente propietario;

    public void ingresar() {

    }

    public void retirar() {

    }


    

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the expira
     */
    public String getExpira() {
        return expira;
    }

    /**
     * @param expira the expira to set
     */
    public void setExpira(String expira) {
        this.expira = expira;
    }

    /**
     * @return the propietario
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    
}