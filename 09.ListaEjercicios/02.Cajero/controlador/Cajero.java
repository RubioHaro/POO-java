package controlador;

import modelo.listaClientes;

/**
 * Cajero
 */
public class Cajero {
    public listaClientes clientes;
    public int id_cliente_activo;
    public int id_cuenta_activa;

    public Cajero() {
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(listaClientes clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the clientes
     */
    public listaClientes getClientes() {
        return clientes;
    }

    /**
     * @param id_cliente_activo the id_cliente_activo to set
     */
    public void setId_cliente_activo(int id_cliente_activo) {
        this.id_cliente_activo = id_cliente_activo;
    }

    /**
     * @return the id_cliente_activo
     */
    public int getId_cliente_activo() {
        return id_cliente_activo;
    }

    /**
     * @param id_cuenta_activa the id_cuenta_activa to set
     */
    public void setId_cuenta_activa(int id_cuenta_activa) {
        this.id_cuenta_activa = id_cuenta_activa;
    }

    /**
     * @return the id_cuenta_activa
     */
    public int getId_cuenta_activa() {
        return id_cuenta_activa;
    }
}