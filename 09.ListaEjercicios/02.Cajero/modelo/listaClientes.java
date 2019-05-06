package modelo;

import java.util.ArrayList;

/**
 * listaClientes
 */
public class listaClientes {

    private ArrayList<Cliente> clientes;

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente consultarCliente(int index) {
        return this.clientes.get(index);
    }

    public void agregarCliente(Cliente c) {
        this.clientes.add(c);
    }

    public void eliminarCliente(int index) {
        this.clientes.remove(index);
    }

}