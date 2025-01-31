import java.util.Map;

public class tipoPokedexIMP implements TipoPokedex{
    private String pokemon;
    private Map<String, String> debilidad;
    private Ataque ataque;
    private Pokemon comparador;

    public tipoPokedexIMP(String pokemon, Map<String, String> debilidad, Ataque ataque, Pokemon comparador) {
        this.pokemon = pokemon;
        this.debilidad = debilidad;
        this.ataque = ataque;
        this.comparador = comparador;
    }

    public String getPokemon() {
        return pokemon;
    }

    public Map<String, String> getDebilidad() {
        return debilidad;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return "tipoPokedexIMP{" +
                "pokemon='" + pokemon + '\'' +
                ", debilidad=" + debilidad +
                ", ataque=" + ataque +
                ", comparador=" + comparador +
                '}';
    }
}
