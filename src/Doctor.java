
public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String genero, String especialidad) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }
}
