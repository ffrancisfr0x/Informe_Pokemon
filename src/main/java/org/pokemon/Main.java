package org.pokemon;

import org.pokemon.services.FileService;

public class Main {
    static void main(String[] args) {
        FileService fs = new FileService();

        var pokemons = fs.cargarJSON("pokemon.json");

        System.out.println("Pokemons cargados para el registro: " + pokemons);
    }
}
