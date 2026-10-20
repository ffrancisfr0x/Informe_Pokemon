package org.pokemon.report;

import org.pokemon.calculator.Calculadora;

public class Informe {
    public String informePokemon(){
        Calculadora calc = new Calculadora();

        String informePokemon = "=============================" +
                "INFORME DE POKEMON" +
                "=============================\n";

        String totalPokemon = "\nTotal de Pokémon: " + calc.calcularTotal();
        String nivelMedio = "\nNivel medio: " + calc.nivelMedio();
        String psMedio = "\nPS medios: " + calc.psMedio();
        String mayorNivel = "\nPokemon con mayor nivel: " + calc.pokemonMayorNivel();
        String masPS = "\nPokemon con mas PS: " + calc.pokemonMasPS();

        return informePokemon + totalPokemon + nivelMedio + psMedio + mayorNivel + masPS;
    }
}
