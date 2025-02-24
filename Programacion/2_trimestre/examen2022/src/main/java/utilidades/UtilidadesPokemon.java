package utilidades;

import org.example.modelos.Pokemon;
import org.example.modelos.TipoPokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesPokemon {
    public List<Pokemon> obtenerPokemonConTipos(List<Pokemon> pokemons, List<TipoPokemon> tipos){
        List<Pokemon> listaPokemon = new ArrayList<>();

        for (Pokemon pokemon : pokemons) {
            for (TipoPokemon tipo : tipos) {
                if (pokemon.getTipos().contains(tipo)){
                    listaPokemon.add(pokemon);
                }
            }
        }

        return listaPokemon;
    }

    public Map<TipoPokemon, List<Pokemon>> obtenerPokemonPurosPorTipo(List<Pokemon> pokemons){
        Map<TipoPokemon, List<Pokemon>> pokemonPurosPorTipo = new HashMap<>();

        for (Pokemon pokemon : pokemons) {
            for (TipoPokemon tipo : pokemon.getTipos()) {
                if (pokemon.getTipos().contains(tipo)){
                    if (pokemonPurosPorTipo.containsKey(tipo)){
                        pokemonPurosPorTipo.get(tipo).add(pokemon);
                    } else {
                        List<Pokemon> listaPokemon = new ArrayList<>();
                        listaPokemon.add(pokemon);
                        pokemonPurosPorTipo.put(tipo, listaPokemon);
                    }
                }
            }
        }

        return pokemonPurosPorTipo;
    }

}
