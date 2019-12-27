package modelo;

import java.util.ArrayList;

/**
 * listaCuentas
 */
public class listaCuentas {
    private ArrayList<Cuenta> cuentas;

    public listaCuentas() {
    }

    /**
     * @param cuentas the cuentas to set
     */
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * @return the cuentas
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public Cuenta buscarCuenta(int index) {
        return cuentas.get(index);
    }

    public Cuenta eliminarCuenta(int index) {
        return cuentas.remove(index);
    }

    public void agregarCuenta(Cuenta c) {
        cuentas.add(c);
    }

}