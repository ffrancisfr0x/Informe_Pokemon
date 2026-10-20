package org.pokemon.calculator;

import org.pokemon.models.Pokemon;
import org.pokemon.services.FileService;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Calculadora {
    FileService fs = new FileService();
    List<Pokemon> pokemons = fs.cargarJSON("pokemon.json");

    public int calcularTotal(){
        int total = 0;

        for (Pokemon pokemon : pokemons) {
            total += pokemon.ps();
        }

        return total;
    }

    public int nivelMedio(){
        int total = 0;
        
        for (Pokemon pokemon : pokemons) {
            total += pokemon.nivel();
        }

        return total / pokemons.size();
    }

    public String pokemonMayorNivel(){
        int mayor = 0;
        String pokemonMayorNivel = "";

        for (Pokemon pokemon : pokemons) {
            if (pokemon.nivel() > mayor) {
                mayor = pokemon.nivel();
                pokemonMayorNivel = pokemon.nombre();
            }
        }
        return pokemonMayorNivel + "(" + mayor + ")";
    }

    public String pokemonMasPS(){
        int mayor = 0;
        String pokemonMasPS = "";

        for (Pokemon pokemon : pokemons) {
            if (pokemon.ps() > mayor) {
                mayor = pokemon.ps();
                pokemonMasPS = pokemon.nombre();
            }
        }
        return pokemonMasPS + "(" + mayor + ")";
    }
}
