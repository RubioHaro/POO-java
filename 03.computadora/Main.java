import java.util.Scanner;

/**
 * HolaMundo
 */

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona man = new Persona();
        System.out.println("¿Deseas realizar un registro? (y/n)");
        if (leer.nextLine().charAt(0) == 'y') {
            System.out.println("Ingresa tu nombre:");
            man.setNombre(leer.nextLine());
            System.out.println("Ingresa tu apellido Paterno:");
            man.setApellido_paterno(leer.nextLine());
            System.out.println("Ingresa tu apellido Materno:");
            man.setApellido_materno(leer.nextLine());
            // System.out.println("Ingresa tu Edad:");
            // man.edad = leer.nextInt();

            System.out.println("El nombre completo es: " + man.getNombreCompleto());
            // System.out.println("Edad: " + man.edad);
            System.out.println("Registro completo!");
        } else
            System.out.println("Procediendo SIN registro...");

        System.out.println("Deseas prender una computadora? (y/n)");

        if (leer.nextLine().charAt(0) == 'y') {
            Computer pc1 = new Computer();
            System.out.println("Ingresa un nombre para tu computadora:");
            pc1.setName(leer.nextLine());
            
            if (startComputer(pc1)) {
                System.out.println("La computadora \""+ pc1.getName() +"\" ha sido prendida");
                System.out.println("===================================");
                System.out.println("Menu de opciones (\""+ pc1.getName() +"\"):");
                System.out.println("1) Apagar Computadora");
                System.out.println("2) Consultar informacion de la computadora");
                System.out.println("3) Modificar Computadora");
                System.out.println("===================================");
                switch (leer.nextInt()) {
                case 1:
                    if (turnOffComputer(pc1)) {
                        System.out.println("Se ha apagado la computadora");
                    }else{
                        System.out.println("No se ha apagado este pedo");
                    }
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.println("Informacion de la computadora:");
                    System.out.println("Tamaño: " + pc1.getSize());
                    System.out.println("Procesador: " + pc1.getProcessor());
                    System.out.println("Color: " + pc1.getColor());
                    System.out.println("Material: " + pc1.getMaterial());
                    System.out.println("Detalles: " + pc1.getText());
                    System.out.println("===================================");
                    break;
                case 3:

                    break;
                case 4:

                    break;

                default:
                    break;
                }
            } else
                System.out.println("no ha sido prendida la computadora :c");
        } else
            System.out.println("Bien, entonces no se que hacer por ti. Bai");

        leer.close();
    }

    public static boolean startComputer(Computer pc) {
        System.out.println("Iniciando computadora....");
        return pc.useEnergy(true);
    }

    public static boolean turnOffComputer(Computer pc) {
        System.out.println("Apagando computadora....");
        return pc.useEnergy(false);
    }

}