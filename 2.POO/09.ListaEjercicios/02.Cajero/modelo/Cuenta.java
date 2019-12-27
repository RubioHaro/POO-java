package modelo;

import java.util.Date;

/**
 * Cuenta
 */
public class Cuenta {
    private int id_cuenta;
    private Double balance;
    private Date fecha_registro;
    private listaMovimientos movimientos;

    public Cuenta() {
    }

    public int getId_cuenta() {
        return this.id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Date getFecha_registro() {
        return this.fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public listaMovimientos getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(listaMovimientos movimientos) {
        this.movimientos = movimientos;
    }

    public void abonar(Double cantidad) {
        this.balance += cantidad;
    }

    public void cargar(Double cantidad) {
        this.balance -= cantidad;
    }

}