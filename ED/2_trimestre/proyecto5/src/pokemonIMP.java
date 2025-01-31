public class pokemonIMP implements Pokemon{
    private Integer numPokemon;
    private String nombrePokemon;
    private String descripcion;
    private Double altura;
    private Double peso;
    private Genero genero;
    private String tipo;

    public pokemonIMP(Integer numPokemon, String nombrePokemon, String descripcion, Double altura, Double peso, Genero genero, String tipo) {
        this.numPokemon = numPokemon;
        this.nombrePokemon = nombrePokemon;
        this.descripcion = descripcion;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.tipo = tipo;
    }

    public Integer getNumPokemon() {
        return numPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "pokemonIMP{" +
                "numPokemon=" + numPokemon +
                ", nombrePokemon='" + nombrePokemon + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", genero=" + genero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
