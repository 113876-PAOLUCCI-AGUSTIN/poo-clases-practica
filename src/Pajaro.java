public class Pajaro extends Animal {

    // PROPERTIES
    private String colorPlumaje;

    public Pajaro(String colorPlumaje, String sexo, Integer edad, Double peso) {
        super.sexo = sexo;
        super.edad = edad;
        super.peso = peso;
        this.colorPlumaje = colorPlumaje;
    }

    // SETTERS
    public String getColorPlumaje() {
        return colorPlumaje;
    }

    // GETTERS
    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    // Implementación del método de la super clase.
    @Override
    public void Come() {
        System.out.println("El pájaro está comiendo.");
    }

    @Override
    public void Duerme() {
        System.out.println("El pájaro está durmiento.");
    }

    public void Vuela(){
        System.out.println("El pájaro está volando");
    }

    @Override
    public String toString() {
        return "Pajaro { " +
                " Color de plumaje= '" + colorPlumaje + '\'' +
                ", sexo= '" + sexo + '\'' +
                ", edad= " + edad +
                ", peso= " + peso +
                '}';
    }
}
