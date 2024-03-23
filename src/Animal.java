public abstract class Animal {

    // ATRIBUTOS.
    String sexo;
    Integer edad;
    Double peso;

    // SETTERS Y GETTERS.
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


    // Métodos.
    public abstract void Duerme();
    public abstract void Come();
    public abstract void SeMueve();
}
