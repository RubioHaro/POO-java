package modelo;

import java.util.Date;

/**
 * Movimiento
 */
public class Movimiento {

    private int id_movimiento;
    private String estado;
    private String descripcion;
    private Date fecha;

    public Movimiento() {
    }

    public Movimiento(int id_movimiento, String estado, String descripcion, Date fecha) {
        this.id_movimiento = id_movimiento;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getId_movimiento() {
        return this.id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}