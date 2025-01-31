public class ataqueIMP implements Ataque{
    private String nombreAtaque;
    private Integer danyoAtaque;

    public ataqueIMP(String nombreAtaque, Integer danyoAtaque) {
        this.nombreAtaque = nombreAtaque;
        this.danyoAtaque = danyoAtaque;
    }

    public String getNombreAtaque() {
        return nombreAtaque;
    }

    public void setNombreAtaque(String nombreAtaque) {
        this.nombreAtaque = nombreAtaque;
    }

    public Integer getDanyoAtaque() {
        return danyoAtaque;
    }

    public void setDanyoAtaque(Integer danyoAtaque) {
        this.danyoAtaque = danyoAtaque;
    }

    @Override
    public String toString() {
        return nombreAtaque + ", " + danyoAtaque;
    }
}
