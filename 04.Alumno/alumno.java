/**
 * alumno
 */
public class alumno extends Persona{
    
    private int boleta;
    private int semester;


    public alumno() {
    }

    public alumno(int boleta, int semester) {
        this.boleta = boleta;
        this.semester = semester;
    }

    public alumno boleta(int boleta) {
        this.boleta = boleta;
        return this;
    }

    public alumno semester(int semester) {
        this.semester = semester;
        return this;
    }


    @Override
    public String getApellido_materno() {
        return super.getApellido_materno();
    }

    @Override
    public String getApellido_paterno() {
        return super.getApellido_paterno();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getNombreCompleto() {
        return super.getNombreCompleto();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setApellido_paterno(String apellido_paterno) {
        super.setApellido_paterno(apellido_paterno);
    }

    @Override
    public void setApellido_materno(String apellido_materno) {
        super.setApellido_materno(apellido_materno);
    }

    /**
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }


    
}