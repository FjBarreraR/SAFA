public interface TipoPoblacion {
    public String getNombre();
    public Double getSuperficie();
    public Integer getNumHabitantes();
    public void setNumHabitantes(Integer numHabitantes);
    public Integer getPersonasTrabajando();
    public void setPersonasTrabajando(Integer personasTrabajando);
    public Integer getNumPersonasEmpleadas();
    public void setNumPersonasEmpleadas(Integer numPersonasEmpleadas);
    public FestivoIMP getFestividad();
    public void setFestividad(FestivoIMP festividad);
    public Double porcentajeDesempleo();
    public Double densidadPoblacion();
}
