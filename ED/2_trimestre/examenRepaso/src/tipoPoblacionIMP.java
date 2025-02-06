public class tipoPoblacionIMP implements TipoPoblacion{
    private String nombre;
    private Integer numHabitantes;
    private Double superficie;
    private Integer personasTrabajando;
    private Integer numPersonasEmpleadas;
    private FestivoIMP festividad;

    public String getNombre() {
        return nombre;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public Integer getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(Integer numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public Integer getPersonasTrabajando() {
        return personasTrabajando;
    }

    public void setPersonasTrabajando(Integer personasTrabajando) {
        this.personasTrabajando = personasTrabajando;
    }

    public Integer getNumPersonasEmpleadas() {
        return numPersonasEmpleadas;
    }

    public void setNumPersonasEmpleadas(Integer numPersonasEmpleadas) {
        this.numPersonasEmpleadas = numPersonasEmpleadas;
    }

    public FestivoIMP getFestividad() {
        return festividad;
    }

    public void setFestividad(FestivoIMP festividad) {
        this.festividad = festividad;
    }

    public Double porcentajeDesempleo(){
        return ((numHabitantes-numPersonasEmpleadas)/numPersonasEmpleadas)*100.0;
    }

    public Double densidadPoblacion(){
        return numHabitantes/superficie;
    }

    public tipoPoblacionIMP(String nombre, Integer numHabitantes, Double superficie, Integer personasTrabajando, Integer numPersonasEmpleadas, FestivoIMP festividad) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
        this.superficie = superficie;
        this.personasTrabajando = personasTrabajando;
        this.numPersonasEmpleadas = numPersonasEmpleadas;
        this.festividad = festividad;
    }

    @Override
    public String toString() {
        return nombre + " posee una densidad de población de " + densidadPoblacion() + "hab/km2. Una de sus fiestas más famosas es la " + festividad;
    }
}
