
public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String genero, String deporte) {
        super(nombre, edad, genero);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Deporte: " + deporte);
    }
}
