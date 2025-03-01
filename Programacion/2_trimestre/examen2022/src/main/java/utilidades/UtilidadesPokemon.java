package utilidades;

import org.example.modelos.Movimiento;
import org.example.modelos.Pokemon;
import org.example.modelos.TipoPokemon;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesPokemon {
    public List<Pokemon> obtenerPokemonConTipos(List<Pokemon> pokemons, List<TipoPokemon> tipos){
        Set<Pokemon> listaPokemon = new HashSet<>();

        for (Pokemon pokemon : pokemons) {
            for (TipoPokemon tipo : tipos) {
                if (pokemon.getTipos().contains(tipo)){
                    listaPokemon.add(pokemon);
                }
            }
        }

        return new ArrayList<>(listaPokemon);
    }

    public List<Pokemon> obtenerPokemonConTipos2(List<Pokemon> pokemons, List<TipoPokemon> tipos){
        List<Pokemon> listaPokemon = new ArrayList<>();

        for (Pokemon pokemon : pokemons) {
            List<TipoPokemon> tiposPokemon = new ArrayList<>(pokemon.getTipos());

            if (tiposPokemon.retainAll(tipos)){
                listaPokemon.add(pokemon);
            }
        }

        return listaPokemon;
    }

    public List<Pokemon> obtenerPokemonConTiposStream(List<Pokemon> pokemons, List<TipoPokemon> tipos){

        return pokemons.stream()
                .filter(pokemon -> pokemon.getTipos().retainAll(tipos))
                .toList();
    }

    public Map<TipoPokemon, List<Pokemon>> obtenerPokemonPurosPorTipo(List<Pokemon> pokemons){
        Map<TipoPokemon, List<Pokemon>> pokemonPurosPorTipo = new HashMap<>();

        for (Pokemon pokemon : pokemons) {
            if (pokemon.getTipos().size() == 1){
                if (pokemonPurosPorTipo.containsKey(pokemon.getTipos().get(0))){
                    pokemonPurosPorTipo.get(pokemon.getTipos().get(0)).add(pokemon);
                } else {
                    List<Pokemon> listaPokemon = new ArrayList<>();
                    listaPokemon.add(pokemon);
                    pokemonPurosPorTipo.put(pokemon.getTipos().get(0), listaPokemon);
                }
            }
        }

        return pokemonPurosPorTipo;
    }

    public Map<TipoPokemon, List<Pokemon>> obtenerPokemonPurosPorTipoStream(List<Pokemon> pokemons){

        return pokemons.stream().filter(p -> p.getTipos().size()==1).collect(Collectors.groupingBy(p -> p.getTipos().getFirst()));
    }

    public List<Movimiento> movimientosQuePuedeAprender(Pokemon pokemon, List<Movimiento> movimientos){
        List<Movimiento> movimientosQuePuedeAprender = new ArrayList<>();

        for (Movimiento movimiento : movimientos) {
            if (pokemon.getTipos().containsAll(movimientos)){
                movimientosQuePuedeAprender.add(movimiento);
            }
        }

        return movimientosQuePuedeAprender;
    }


}
