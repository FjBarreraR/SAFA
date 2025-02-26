package utilidades;

import org.example.modelos.Entrenador;
import org.example.modelos.LineaEvolutiva;
import org.example.modelos.Pokemon;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesCombate {
    public Map<Entrenador, Integer> repartirPokemon(List<Entrenador> entrenadores, List<Pokemon> pokemon){
        Map<Entrenador, Integer> mapaEntrenadorPokemon = new HashMap<>();

        if (entrenadores.size() % pokemon.size() == 0){
            for ()
        }
        return mapaEntrenadorPokemon;
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
        boolean puedeEvolucionar = false;

        Integer nivel = pokemon.getNivel();

        Integer posicion = pokemon.getLinenaEvolutiva()
                .stream()
                .filter(p->p.getPokemon().getLinenaEvolutiva().equals(pokemon.getLinenaEvolutiva()))
                .findFirst().get().getOrden();

        LineaEvolutiva lineaEvolutiva = pokemon.getLinenaEvolutiva().stream().filter(p -> p.getOrden().equals(posicion + 1)).findFirst().orElse(null);

        if (lineaEvolutiva != null ){
            if (nivel >= lineaEvolutiva.getNivelParaEvolucionar()){
                puedeEvolucionar = true;
            }
        }

        return puedeEvolucionar;
    }

}
