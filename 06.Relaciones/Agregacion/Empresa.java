/**
 * Empresa
 */
public class Empresa {

    private String nombre;
    private int añoFundacion;
    private String tipo;
    private Cliente cliente;
    
    public Empresa() {
    }

    public Empresa(String nombre, int añoFundacion, String tipo, Cliente cliente) {
        this.nombre = nombre;
        this.añoFundacion = añoFundacion;
        this.tipo = tipo;
        this.cliente = cliente;
    }
    

    void CrearNuevoNegocio(Cliente c){
        this.cliente = c;
    }
}