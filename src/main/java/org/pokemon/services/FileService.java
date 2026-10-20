package org.pokemon.services;

import org.pokemon.models.Pokemon;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public List<Pokemon> cargarJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        List<Pokemon> pokemons = new ArrayList<>();
        try {
            pokemons = mapper.readValue(new File(path), new TypeReference<List<Pokemon>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemons;
    }

    public void guardarArchivoTxt() {
        try (var bfr = new BufferedWriter(new FileWriter("pokemon.txt"))) {
            bfr.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
