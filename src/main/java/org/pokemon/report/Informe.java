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

    public String pokemonPorTipo() {

        Calculadora calc = new Calculadora();

        var cantidades = calc.totalTipo();
        var nombres = calc.pokemonPorTipo();

        String informeTipo =
                "=============================\n" +
                        "POKEMON POR TIPO\n" +
                        "=============================\n";

        for (var entrada : cantidades.entrySet()) {

            String tipo = entrada.getKey();

            informeTipo += "\n" + tipo + ": " + entrada.getValue() + "\n";

            for (String nombre : nombres.get(tipo)) {
                informeTipo += nombre + "\n";
            }
        }

        return informeTipo;
    }
}
