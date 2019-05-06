import java.util.Scanner;

/**
 * HolaMundo
 */

public class Main {

    public static void main(String[] args) {
        boolean login = false;
        boolean c = true;
        int computadorasActivas = 0;

        Scanner leer = new Scanner(System.in);
        alumno man = new alumno();

        System.out.println("Procediendo SIN registro... (Algunas funciones seran limitadas)");

        while (c) {
            System.out.println("===================================");
            System.out.println("Menu de opciones:");
            System.out.println("1) Salir");
            System.out.println("2) Ver computadoras activas");
            if (login) {
                System.out.println("3) Cerrar Sesion");
                System.out.println("4) Modificar datos personales");
            } else {
                System.out.println("3) Iniciar Sesion (funciones avanzadas)");
            }

            System.out.println("============================================");
            Scanner menuScanner = new Scanner(System.in);
            switch (menuScanner.nextInt()) {
            case 1:
                System.out.println("Adios.... :c");
                System.exit(0);
                break;
            case 2:
                if (login) {
                    if (computadorasActivas <= 0) {
                        MenuComputadora(man, computadorasActivas);
                    } else {
                        System.out.println("Hay computadoras activas");
                    }
                } else {
                    System.out.println("Necesitas iniciar sesiion para ver las computadoras activas.");
                }

                break;
            case 3:
                if (login) {
                    System.out.println("Cerrando sesión...");
                    login = false;
                    man = new alumno();
                } else {
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
                    login = true;
                }
                break;
            case 4:
                if (login) {
                    System.out.println("===================================");
                    System.out.println("Nombre: " + man.getNombreCompleto());
                    if (man.getBoleta() != 0) {
                        System.out.println("Boleta: " + man.getBoleta());
                    } else {
                        System.out.println("Boleta: no ingresada");
                    }
                    if (man.getSemester() != 0) {
                        System.out.println("Semestre: " + man.getSemester());
                    } else {
                        System.out.println("Semestre: no ingresado");
                    }

                    System.out.println("===================================");
                    Scanner menuUser = new Scanner(System.in);
                    System.out.println("Deseas cambiar tus datos? (y/n)");
                    if (menuUser.nextLine().charAt(0) == 'y') {
                        System.out.println("===================================");
                        System.out.print("Ingrese tu nombre: ");
                        man.setNombre(menuUser.nextLine());
                        System.out.print("Ingrese el apellido paterno: ");
                        man.setApellido_paterno(menuUser.nextLine());
                        System.out.print("Ingrese el apellido materno: ");
                        man.setApellido_materno(menuUser.nextLine());
                        System.out.print("Ingrese la boleta: ");
                        man.setBoleta(menuUser.nextInt());
                        System.out.print("Ingrese el semestre: ");
                        man.setSemester(menuUser.nextInt());
                    }
                } else {
                    System.out.println("Accion invalida!!!");
                }
                break;
            default:
                break;
            }
        }

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

    public static void MenuComputadora(alumno man, int computadorasActivas) {
        System.out.println("============================================");
        System.out.println("No hay computadoras activas");
        System.out.println("Deseas prender una computadora? (y/n)");
        boolean c = true;

        Scanner menuComputer = new Scanner(System.in);

        if (menuComputer.nextLine().charAt(0) == 'y') {
            Computer pc1 = new Computer();
            Scanner numberScanner = new Scanner(System.in);
            System.out.println("Ingresa un nombre para tu computadora:");
            pc1.setName(menuComputer.nextLine());

            System.out.println("Ingresa tu numero de boleta:");

            man.setBoleta(numberScanner.nextInt());

            if (startComputer(pc1)) {
                computadorasActivas++;
                System.out.println("La computadora \"" + pc1.getName() + "\" ha sido prendida");
                while (c) {

                    System.out.println("===================================");
                    System.out.println("Usuario activo: " + man.getNombreCompleto() + " (" + man.getBoleta() + ")");
                    System.out.println("Menu de opciones (\"" + pc1.getName() + "\"):");
                    System.out.println("1) Apagar Computadora");
                    System.out.println("2) Consultar informacion de la computadora");
                    System.out.println("3) Modificar computadora");
                    System.out.println("4) Abrir Pets");
                    System.out.println("============================================");
                    switch (menuComputer.nextInt()) {
                    case 1:
                        if (!turnOffComputer(pc1)) {
                            System.out.println("Se ha apagado la computadora");
                            computadorasActivas--;
                            c = false;
                        } else
                            System.out.println("No se ha apagado este pedo");
                        break;
                    case 2:
                        System.out.println("===================================");
                        System.out.println("Informacion de la computadora:");
                        System.out.println("Procesador: " + pc1.getProcessor() + " nucleos");
                        System.out.println("Color: " + pc1.getColor());
                        System.out.println("Material: " + pc1.getMaterial());
                        System.out.println("Detalles: " + pc1.getText());
                        System.out.println("===================================");
                        break;
                    case 3:
                        Scanner ScanComputerSettings = new Scanner(System.in);
                        System.out.println("===================================");
                        System.out.println("Modificar computadora:");
                        System.out.print("Ingrese el Color: ");
                        pc1.setColor(ScanComputerSettings.nextLine());
                        System.out.print("Ingrese el material: ");
                        pc1.setMaterial(ScanComputerSettings.nextLine());
                        System.out.print("Ingrese la descripcion de la computadora: ");
                        pc1.setText(ScanComputerSettings.nextLine());
                        System.out.print("Ingrese la cantidad de nucleos del procesador: ");
                        pc1.setProcessor(ScanComputerSettings.nextInt());
                        System.out.println("===================================");
                        break;
                    case 4:
                        System.out.println("===================================");
                        Mascota pet = new Mascota();
                        pet.setMaster(man.getNombre());
                        System.out.println(pet.saludo());
                        boolean condition = true;
                        while (condition) {
                            Scanner ScanPets = new Scanner(System.in);
                            System.out.println("1) Conocer sobre mi");
                            System.out.println("2) Te cuento un chiste");
                            System.out.println("3) Despedir mascota :c");
                            System.out.println("===================================");
                            System.out.print("Eliga una opción:");
                            switch (ScanPets.nextInt()) {
                            case 1:
                                System.out.println("===================================");
                                System.out.println("nombre: " + pet.name);
                                System.out.println("tipo: " + pet.type);
                                System.out.println("edad: " + pet.age + " años");
                                System.out.println("hora de comer: " + pet.sleep_time);
                                System.out.println("felicidad: " + pet.happy);
                                System.out.println("dueño: " + pet.master);
                                System.out.println("===================================");
                                break;
                            case 2:
                                System.out.println(pet.chiste());
                                break;
                            case 3:
                                System.out.println(pet.getName() + ": Bai bai :c");
                                condition = false;
                                break;

                            default:
                                break;
                            }
                        }
                        break;
                    default:
                        break;
                    }
                }

            } else
                System.out.println("no ha sido prendida la computadora :c");
        } else
            System.out.println("Bien, entonces no se que hacer por ti. Bai");

    }

}