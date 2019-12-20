import java.util.Scanner;

/**
 * HolaMundo
 */

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo en java");
        Persona man = new Persona();
/* esta instancia hace referencia a bloques de codigo: pila, monticulo, bloque de datos y de metodos*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        man.setNombre(leer.nextLine());
        System.out.println("Ingresa tu apellido Paterno:");
        man.setApellido_paterno(leer.nextLine());
        System.out.println("Ingresa tu apellido Materno:");
        man.setApellido_materno(leer.nextLine());
        System.out.println("Ingresa tu Edad:");
        man.edad = leer.nextInt();
        leer.close();
        System.out.println("El nombre completo es: " + man.getNombreCompleto());
        System.out.println("Edad: " + man.edad);
        
        boolean dato = man.comer(5);
        if(dato)
            System.out.println(man.getNombre()+" ya comio");
            else
            System.out.println(man.getNombre()+" no comio");


    }

}