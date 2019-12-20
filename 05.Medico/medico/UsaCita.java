import java.util.Scanner;
import java.util.ArrayList;
//import sun.java2d.cmm.kcms.CMM;

public class UsaCita
{
	public static void main(String[] args) 
	{
		int opc=0, opc2=0,n=0;
		long nss=0;
		String nomb;
		Scanner l=new Scanner(System.in);
		ArrayList<CitaMedica> al=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a2=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a3=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a4=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a5=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a6=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a7=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a8=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a9=new ArrayList<CitaMedica>();
		ArrayList<CitaMedica> a10=new ArrayList<CitaMedica>();
		
		//al.add(new CitaMedica());
		//al.add(new CitaMedica());
		
		do
		{
			menu();
			opc=l.nextInt();
			l.nextLine();
			System.out.println("-----------------------------");

			//Inicio codigo Altas 
			if(opc==1)
			{
                            System.out.println("Ingrese\n "
                                    + " 1)Dar de alta cita con datos completos\n"
                                    + "2)Dar de alta cita con Nombre de paciente y doctor"
                                    + "3)Dar de alta cita con nombre de paciente, consultorio y doctor\n"
                                    + "4)Dar de alta cita con nombre del paciente, hora de la cita y consultorio\n"
                                    + "5)Dar de alta cita con Nombre del paciente, numero del seguro social y consultorio\n"
                                    + "6)Dar de alta cita con hora de la cita, nombre del paciente y padecimiento\n"
                                    + "7)Dar de alta cita con nombre del paciente, nombre del doctor,NSS y consultorio \n"
                                    + "8)Dar de alta cita con NSS,hora de la cita, doctor, y consultorio\n"
                                    + "9)Dar de alta cita con NSS, domicilio, doctor, padecimiento y consultorio\n"
                                    + "10)Dar de alta cita con domicilio, tipo de sangre, hora de la cita, nombre del paciente, doctor,genero, NSS, edad y consultorio\n");
                                int opc3=l.nextInt();
                                
                            if(opc3==1)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                
                                 System.out.println("Ingrese domicilio\n");
                                    String domicilio=l.next();
                                    
                                 System.out.println("Ingrese el tipo de sangre\n ");
                                    String tipoSangre=l.next();
                                    
                                 System.out.println("Ingrese alergias\n");
                                    String alergias=l.next();
                                    
                                 System.out.println("Ingrese la hora de la cita\n");
                                    String horaCita=l.next();
                                 
                                 System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                    
                                 System.out.println("Padecimiento\n");
                                    String padecimiento=l.next();
                                    
                                 System.out.println("Ingrese su genero\n");
                                    char genero=l.next().charAt(0);
                                    
                                 System.out.println("Ingrese telefono fijo\n");
                                    long telefonoFijo=l.nextLong();
                            
                                System.out.println("Ingrese telefono celular\n");
                                    long telefonoCelular=l.nextLong();
                                    
                                System.out.println("Ingerese su NSS\n");
                                    long numSeguroSocial=l.nextLong();
                                    
                                System.out.println("Ingrese su edad\n");
                                    int edad=l.nextInt();
                                    
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                    
                                
                                   
                                al.add(new CitaMedica(nombrePaciente,domicilio,tipoSangre,alergias,horaCita,doctor,padecimiento,genero,telefonoFijo,telefonoCelular,numSeguroSocial,edad,consultorio));
                                
                            }
                            
                            if(opc3==2)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                    
                                System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                    
                                a2.add(new CitaMedica(nombrePaciente,doctor));
                            }
                            
                            if(opc==3)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                    
                                System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                    
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                    
                                a3.add(new CitaMedica(nombrePaciente, consultorio,doctor));
                                    
                                
                            }
                            
                            if(opc==4)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                System.out.println("Ingrese la hora de la cita\n");
                                    String horaCita=l.next();
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                    
                                a4.add(new CitaMedica(nombrePaciente, horaCita, consultorio));
                            }
                            
                            if(opc==5)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                System.out.println("Ingerese su NSS\n");
                                    long numSeguroSocial=l.nextLong();
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                 
                                a5.add(new CitaMedica(nombrePaciente,numSeguroSocial,consultorio));
                            }
                            
                            if(opc==6)
                            {
                                System.out.println("Ingrese la hora de la cita\n");
                                    String horaCita=l.next();
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                System.out.println("Padecimiento\n");
                                    String padecimiento=l.next();
                                    
                                a6.add(new CitaMedica(horaCita, nombrePaciente, padecimiento));
                            }
                            
                            if(opc==7)
                            {
                                
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                System.out.println("Ingerese su NSS\n");
                                    long numSeguroSocial=l.nextLong();
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                    
                                a7.add(new CitaMedica(nombrePaciente, doctor, numSeguroSocial, consultorio));
                            }
                            
                            if(opc==8)
                            {
                                System.out.println("Ingerese su NSS\n");
                                    long numSeguroSocial=l.nextLong();
                                System.out.println("Ingrese la hora de la cita\n");
                                    String horaCita=l.next();
                                System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                a8.add(new CitaMedica(numSeguroSocial, horaCita, doctor, consultorio));
                            }
                            
                            if(opc==9)
                            {
                                System.out.println("Ingerese su NSS\n");
                                    long numSeguroSocial=l.nextLong();
                                System.out.println("Ingrese domicilio\n");
                                    String domicilio=l.next();
                                System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                System.out.println("Padecimiento\n");
                                    String padecimiento=l.next();
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                    
                                a9.add(new CitaMedica(numSeguroSocial, domicilio, doctor, padecimiento, consultorio));
                            }
                            
                            if(opc==10)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                
                                 System.out.println("Ingrese domicilio\n");
                                    String domicilio=l.next();
                                    
                                 System.out.println("Ingrese el tipo de sangre\n ");
                                    String tipoSangre=l.next();
                                    
                                 System.out.println("Ingrese la hora de la cita\n");
                                    String horaCita=l.next();
                                 
                                 System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                    
                                 System.out.println("Ingrese su genero\n");
                                    char genero=l.next().charAt(0);
                                    
                                System.out.println("Ingerese su NSS\n");
                                    long numSeguroSocial=l.nextLong();
                                    
                                System.out.println("Ingrese su edad\n");
                                    int edad=l.nextInt();
                                    
                                System.out.println("Ingrese consultorio\n");
                                    int consultorio=l.nextInt();
                                    
                                a10.add(new CitaMedica(domicilio, tipoSangre, horaCita, nombrePaciente, doctor, genero, numSeguroSocial, edad, consultorio));
                            }
                            
                            
			}
			//Fin codigo Altas

			//Inicio codigo Modificar cita medica
			else if(opc==2)
			{
                            System.out.println("Ingrese NSS\n");
                            nss=l.nextLong();
                            l.nextLine();
                            System.out.println("-----------------------------");

                            for(int i=0; i<al.size(); i++)
                            {
                                if(al.get(i).getNumSeguroSocial()==nss)
                                    {
					System.out.println("\n"
                                    + "1)Modificar nombre del paciente"
                                    + "2)"
                                    + "3)"
                                    + "4)"
                                    + "5)"
                                    + "6)"
                                    + "7)"
                                    + "8)"
                                    + "9)"
                                    + "10)");
                                    int opc4=l.nextInt();
                                    
                            if(opc4==1)
                            {
                                System.out.println("Ingrese nombre del paciente\n");
                                    String nombrePaciente=l.next();
                                al.get(i).setNombrePaciente(nombrePaciente);
                            }
                            
                            if(opc4==2)
                            {
                                System.out.println("Ingrese su domicilio\n");
                                    String domicilio=l.next();
                                al.get(i).setDomicilio(domicilio);
                                
                            }
                            
                            if(opc4==3)
                            {
                                System.out.println("Ingrese tiopo de sangre\n");
                                    String tipoSangre=l.next();
                                al.get(i).setTipoSangre(tipoSangre);
                            }
                            
                            if(opc4==4)
                            {
                                System.out.println("Ingrese las alergias\n");
                                    String alergias =l.next();
                                al.get(i).setAlergias(alergias);
                            }
                            
                            if(opc4==4)
                            {
                                System.out.println("Ingrese la hora de la cita\n");
                                    String horaCita=l.next();
                                al.get(i).setHoraCita(horaCita);
                            }
                            
                            if(opc4==5)
                            {
                                System.out.println("Ingrese nombre del doctor\n");
                                    String doctor=l.next();
                                al.get(i).setDoctor(doctor);
                            }
                            
                            if(opc4==6)
                            {
                                System.out.println("Ingrese padecimiento\n");
                                    String padecimiento =l.next();
                                al.get(i).setPadecimiento(padecimiento);
                            }
                            
                            if(opc4==7)
                            {
                                System.out.println("Ingrese su genero");
                                    String genero=l.next();
                                al.get(i).setGenero(genero.charAt(0));
                            }
                            
                            if(opc4==8)
                            {
                                System.out.println("Ingrese telefono fijo\n");
                                    long telefonoFijo =l.nextLong();
                                al.get(i).setTelefonoFijo(nss);
                            }
                            
                            if(opc4==9)
                            {
                                System.out.println("Ingrese telefono celular\n");
                                    long telefonoCelular=l.nextLong();
                                al.get(i).setTelefonoCelular(telefonoCelular);
                            }
                            
                            if(opc4==10)
                            {
                                System.out.println("Ingrese NSS\n");
                                    long numeroSeguroSocial=l.nextLong();
                                al.get(i).setNumSeguroSocial(numeroSeguroSocial);
                            }
                            
                            if(opc4==11)
                            {
                                System.out.println("Ingrese la edad\n");
                                    int edad=l.nextInt();
                                al.get(i).setEdad(edad);
                            }
                            
                            if(opc4==12)
                            {
                                System.out.println("Ingrese el consultorio");
                                    int consultorio =l.nextInt();
                                al.get(i).setConsultorio(consultorio);
                            }
                                    
                                    
                                    }
                            }
                            
			}
			//Fin codigo Modificar cita medica

			//Inicio codigo eliminar por numero social
			else if(opc==3)
			{
				System.out.println("Introduzca el numero de seguro social");
				nss=l.nextLong();
				l.nextLine();

				for(int i=0; i<al.size(); i++)
				{
					if(al.get(i).getNumSeguroSocial()==nss)
						{
							al.remove(i);
							i=al.size();
						}
				}
			}
			//Fin codigo eliminar por numero social

			//Inicio codigo consultas
			else if(opc==4)
			{
				do
				{
					menuConsultas();
					opc2=l.nextInt();
					l.nextLine();
					System.out.println("-----------------------------");

					//Inicio codigo consultar por nss
					if(opc2==1)
					{
						System.out.println("Introduzca el numero de seguro social");
						nss=l.nextLong();
						l.nextLine();
						System.out.println("-----------------------------");

						for(int i=0; i<al.size(); i++)
						{
							if(al.get(i).getNumSeguroSocial()==nss)
							{
								System.out.println(al.get(i).getNombrePaciente());
								System.out.println(al.get(i).getEdad());
								System.out.println(al.get(i).getDomicilio());
								System.out.println(al.get(i).getGenero());
								System.out.println(al.get(i).getTelefonoFijo());
								System.out.println(al.get(i).getTelefonoCelular());
								System.out.println(al.get(i).getNumSeguroSocial());
								System.out.println(al.get(i).getTipoSangre());
								System.out.println(al.get(i).getAlergias());
								System.out.println(al.get(i).getHoraCita());
								System.out.println(al.get(i).getConsultorio());
								System.out.println(al.get(i).getDoctor());
								System.out.println(al.get(i).getPadecimiento());
								System.out.println("-----------------------------");
							}
						}	
					}
					//Fin codigo consultar por nss

					//Inicio codigo consultar por nombre del paciente
					else if(opc2==2)
					{
						System.out.println("Introduzca el nombre del paciente");
						nomb=l.nextLine();
						System.out.println("-----------------------------");

						for(int i=0; i<al.size(); i++)
						{
							if(al.get(i).getNombrePaciente().equals(nomb))
							{
								System.out.println(al.get(i).getNombrePaciente());
								System.out.println(al.get(i).getEdad());
								System.out.println(al.get(i).getDomicilio());
								System.out.println(al.get(i).getGenero());
								System.out.println(al.get(i).getTelefonoFijo());
								System.out.println(al.get(i).getTelefonoCelular());
								System.out.println(al.get(i).getNumSeguroSocial());
								System.out.println(al.get(i).getTipoSangre());
								System.out.println(al.get(i).getAlergias());
								System.out.println(al.get(i).getHoraCita());
								System.out.println(al.get(i).getConsultorio());
								System.out.println(al.get(i).getDoctor());
								System.out.println(al.get(i).getPadecimiento());
								System.out.println("-----------------------------");
							}
						}
					}
					//Fin codigo consultar por nombre del paciente

					//Inicio codigo consultar por numero del consultorio
					else if(opc2==3)
					{
						System.out.println("Introduzca el numero del consultorio");
						n=l.nextInt();
						l.nextLine();
						System.out.println("-----------------------------");

						for(int i=0; i<al.size(); i++)
						{
							if(al.get(i).getConsultorio()==n)
							{
								System.out.println(al.get(i).getNombrePaciente());
								System.out.println(al.get(i).getEdad());
								System.out.println(al.get(i).getDomicilio());
								System.out.println(al.get(i).getGenero());
								System.out.println(al.get(i).getTelefonoFijo());
								System.out.println(al.get(i).getTelefonoCelular());
								System.out.println(al.get(i).getNumSeguroSocial());
								System.out.println(al.get(i).getTipoSangre());
								System.out.println(al.get(i).getAlergias());
								System.out.println(al.get(i).getHoraCita());
								System.out.println(al.get(i).getConsultorio());
								System.out.println(al.get(i).getDoctor());
								System.out.println(al.get(i).getPadecimiento());
								System.out.println("-----------------------------");
							}
						}
					}
					//Fin codigo consultar por numero del consultorio

				}while(opc2>0 && opc2<4);
				//Fin codigo consultas
			}
			
			System.out.println("-----------------------------\n");

		}while(opc>0 && opc<5);
		
	}

	public static void menu()
	{
			System.out.println("Seleccione una opcion");
            System.out.println("1. Dar de alta cita");
            System.out.println("2. Modificar cita medica");
            System.out.println("3. Eliminar cita medica");
            System.out.println("4. Consultar cita medica");
	}
	
	public static void menuConsultas()
	{
			System.out.println("Seleccione una opcion");
            System.out.println("1. Consultar por nss");
            System.out.println("2. Consultar por nombre");
            System.out.println("3. Consultar por consultorio");
	}


}