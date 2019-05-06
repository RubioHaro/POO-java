/**
 * Impresora
 */
public class Impresora {

    private String nombre;
    private boolean wifi;
    private boolean usb;
    private boolean prendida;

    public Impresora() {
        this.prendida = false;
    }

    public Impresora(String nombre) {
        this.nombre = nombre;
        this.wifi = false;
        this.usb = false;
        this.prendida = false;
    }

    public Impresora(String nombre, boolean wifi, boolean usb, boolean prendida) {
        this.nombre = nombre;
        this.wifi = wifi;
        this.usb = usb;
        this.prendida = prendida;
    }

    public Impresora(String nombre, boolean wifi, boolean usb) {
        this.nombre = nombre;
        this.wifi = wifi;
        this.usb = usb;
        this.prendida = false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isWifi() {
        return this.wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isUsb() {
        return this.usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }

    public boolean isPrendida() {
        return this.prendida;
    }

    public void setPrendida(boolean prendida) {
        this.prendida = prendida;
    }

    public Impresora nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

}