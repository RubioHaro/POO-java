/**
 * Mascota
 */
public class Mascota {

    public String name;
    public String type;
    public String master;
    public int age;
    public boolean happy;
    public short sleep_time;

    public Mascota() {
        this.name = "Tux";
        this.type = "Pinguino";
        this.master = "Usuario";
        this.age = 3;
        this.happy = true;
        this.sleep_time = 9;
    }

    public Mascota(String name, String type, String master, int age, boolean happy, short sleep_time) {
        this.name = name;
        this.type = type;
        this.master = master;
        this.age = age;
        this.happy = happy;
        this.sleep_time = sleep_time;
    }

    public String saludo() {
        int number = (int) (Math.random() * 6) + 1;
        String saludo;
        switch (number) {
        case 1:
            saludo = "Hola";
            break;

        case 2:
            saludo = "Buenas";
            break;

        case 3:
            saludo = "¿Qué hay?";
            break;

        case 4:
            saludo = "Holiwis";
            break;

        case 5:
            saludo = "Un placer en saludarte";
            break;

        default:
            saludo = "Hi";
            break;
        }
        saludo = saludo + ", mi nombre es " + name;
        return saludo;
    }

    public String chiste() {
        int number = (int) (Math.random() * 14) + 1;
        String joke;
        switch (number) {
        case 1:
            joke = "¿Qué es una mujer objeto? Una instancia de una mujer con clase.";
            break;

        case 2:
            joke = "¿Qué le menciona una IP a otra? — ¿Qué tramas?.";
            break;

        case 3:
            joke = "¿Qué es un terapeuta? – 1024 Gigapeutas.";
            break;

        case 4:
            joke = "¿Que le habla un bit al otro? Nos vemos en el bus.";
            break;

        case 5:
            joke = "¿Cuántos programadores hacen falta para cambiar una bombilla? – Ninguno, porque es un problema hardware.";
            break;

        case 6:
            joke = "Error 0094782: No se detecta ningún teclado pulse una tecla para continuar.";
            break;

        case 7:
            joke = "¿Qué le dice un .GIF a un .JPEG? -Anímate viejo.";
            break;
        case 8:
            joke = "Los verdaderos programadores programan en binario.";
            break;
        case 9:
            joke = "No te despedirán del trabajo, si nunca comentas tu código y además eres el único que sabe cómo funciona.";
            break;

        case 10:
            joke = "Sólo hay 10 tipos de personas en este bendito mundo, las que entienden binario y las que no.";
            break;

        case 11:
            joke = "La barriga de un programador es directamente proporcional a la cantidad de información que maneja.";
            break;

        case 12:
            joke = "¿SabesComoArreglarLaBarraEspaciadora?.";
            break;
        default:
            joke = "¿Qué es el hardware? - El que recibe los golpes cuando falla el software.";
            break;
        }
        return joke;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaster() {
        return this.master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy() {
        return this.happy;
    }

    public boolean getHappy() {
        return this.happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public short getSleep_time() {
        return this.sleep_time;
    }

    public void setSleep_time(short sleep_time) {
        this.sleep_time = sleep_time;
    }

}