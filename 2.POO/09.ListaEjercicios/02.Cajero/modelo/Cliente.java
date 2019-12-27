package modelo;

/**
 * Cliente
 */
public class Cliente {

    private String nombre;
    private String apellido_paterno;
    private String apellido_m;
    private listaCuentas cuentas;

    public Cliente(String nombre, String apellido_paterno, String apellido_m, listaCuentas cuentas) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_m = apellido_m;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return this.apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_m() {
        return this.apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public listaCuentas getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(listaCuentas cuentas) {
        this.cuentas = cuentas;
    }

}
