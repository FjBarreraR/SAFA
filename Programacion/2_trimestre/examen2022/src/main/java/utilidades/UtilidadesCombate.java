package utilidades;

import org.example.modelos.Entrenador;
import org.example.modelos.LineaEvolutiva;
import org.example.modelos.Pokemon;
import org.example.modelos.TipoPokemon;

import java.util.*;

public class UtilidadesCombate {
    public Map<Entrenador, Integer> repartirPokemon(List<Entrenador> entrenadores, List<Pokemon> pokemon){
        Map<Entrenador, Integer> mapaEntrenadorPokemon = new HashMap<>();

        if (pokemon.size() % entrenadores.size() == 0){
            int cuantosTocamosPorEntrenador = pokemon.size() / entrenadores.size();

            for (Entrenador e : entrenadores) {
                e.getEquipoPokemon().addAll(pokemon.subList(0, cuantosTocamosPorEntrenador));
                pokemon.retainAll(pokemon.subList(0, cuantosTocamosPorEntrenador));
            }
        }

        for (Entrenador e : entrenadores) {
            List<TipoPokemon> tiposPreferidos = new ArrayList<>(e.getTiposPreferidos());

            int puntos = 0;

            for (Pokemon p : e.getEquipoPokemon()) {
                List<TipoPokemon> tiposQueCoincieden = new ArrayList<>(p.getTipos());
                tiposQueCoincieden.retainAll(tiposPreferidos);
                puntos += tiposQueCoincieden.size();
            }
            mapaEntrenadorPokemon.put(e, puntos);
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
