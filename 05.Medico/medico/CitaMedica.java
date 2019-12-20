/**
 * cita_medica
 */
public class CitaMedica {

    private String domicilio;
    private String tipoSangre;
    private String alergias;
    private String horaCita;
    private String nombrePaciente;
    private String doctor;
    private String padecimiento;
    private char genero;

    private long telefonoFijo;
    private long telefonoCelular;
    private long numSeguroSocial;
    private int edad;
    private int consultorio;

    

    public CitaMedica(String nombrePaciente, String doctor) {
        this.nombrePaciente = nombrePaciente;
        this.doctor = doctor;
    }

    public CitaMedica(String nombrePaciente, int consultorio, String doctor) {
        this.nombrePaciente = nombrePaciente;
        this.doctor = doctor;
        this.consultorio = consultorio;
    }

    public CitaMedica(String nombrePaciente, String horaCita, int consultorio) {
        this.horaCita = horaCita;
        this.nombrePaciente = nombrePaciente;
        this.consultorio = consultorio;
    }

    public CitaMedica(String nombrePaciente, long numSeguroSocial, int consultorio) {
        this.nombrePaciente = nombrePaciente;
        this.numSeguroSocial = numSeguroSocial;
        this.consultorio = consultorio;
    }

    public CitaMedica(String horaCita, String nombrePaciente, String padecimiento) {
        this.horaCita = horaCita;
        this.nombrePaciente = nombrePaciente;
        this.padecimiento = padecimiento;
    }

    public CitaMedica(String nombrePaciente, String doctor, long numSeguroSocial, int consultorio) {
        this.nombrePaciente = nombrePaciente;
        this.doctor = doctor;
        this.numSeguroSocial = numSeguroSocial;
        this.consultorio = consultorio;
    }


    public CitaMedica(long numSeguroSocial,String horaCita, String doctor,  int consultorio) {
        this.horaCita = horaCita;
        this.doctor = doctor;
        this.numSeguroSocial = numSeguroSocial;
        this.consultorio = consultorio;
    }


    public CitaMedica(long numSeguroSocial,String domicilio, String doctor, String padecimiento,  int consultorio) {
        this.numSeguroSocial = numSeguroSocial;
        this.domicilio = domicilio;
        this.doctor = doctor;
        this.padecimiento = padecimiento;
        this.consultorio = consultorio;
    }


    public CitaMedica(String domicilio, String tipoSangre, String horaCita, String nombrePaciente, String doctor,
            char genero, long numSeguroSocial, int edad, int consultorio) {
        this.domicilio = domicilio;
        this.tipoSangre = tipoSangre;
        this.horaCita = horaCita;
        this.nombrePaciente = nombrePaciente;
        this.doctor = doctor;
        this.genero = genero;
        this.numSeguroSocial = numSeguroSocial;
        this.edad = edad;
        this.consultorio = consultorio;
    }

    public CitaMedica(String nombrePaciente, String domicilio, String tipoSangre, String alergias, String horaCita,
            String doctor, String padecimiento, char genero, long telefonoFijo, long telefonoCelular,
            long numSeguroSocial, int edad, int consultorio) {
        this.domicilio = domicilio;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.horaCita = horaCita;
        this.nombrePaciente = nombrePaciente;
        this.doctor = doctor;
        this.padecimiento = padecimiento;
        this.genero = genero;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.numSeguroSocial = numSeguroSocial;
        this.edad = edad;
        this.consultorio = consultorio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public long getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public long getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(long telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public long getNumSeguroSocial() {
        return numSeguroSocial;
    }

    public void setNumSeguroSocial(long numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

}