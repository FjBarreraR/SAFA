package utilidades;

import org.example.modelos.Entrenador;
import org.example.modelos.LineaEvolutiva;
import org.example.modelos.Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class UtilidadesCombate {
    public Map<Entrenador, Integer> repartirPokemon(List<Entrenador> entrenadores, List<Pokemon> pokemon){

    }

    public void subirAlNivel(Pokemon pokemon, Integer nivel){
        pokemon.setNivel(nivel);
        pokemon.getStats().setAt(pokemon.getStats().getAt() + (nivel * 2));
        pokemon.getStats().setDf(pokemon.getStats().getDf() + (nivel * 2));
        pokemon.getStats().setSpa(pokemon.getStats().getSpa() + (nivel * 2));
        pokemon.getStats().setSpdf(pokemon.getStats().getSpdf() + (nivel * 2));
        pokemon.getStats().setSpd(pokemon.getStats().getSpd() + (nivel * 2));
        pokemon.getStats().setPs(pokemon.getStats().getPs() + (nivel * 2));
    }

    public boolean puedeEvolucionar(Pokemon pokemon){
        Integer nivel = pokemon.getNivel();
        Integer posicion = pokemon.getLinenaEvolutiva()
                .stream()
                .filter(p->p.getPokemon().getLinenaEvolutiva().equals(pokemon.getLinenaEvolutiva()))
                .findFirst().get().getOrden();

        Integer maxOden = pokemon.getLinenaEvolutiva().stream().max(Comparator.comparing(LineaEvolutiva::getOrden)).get().getOrden();

        return 
    }

}
