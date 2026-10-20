package org.pokemon.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Pokemon(
        Integer id,
        String nombre,
        String tipo,
        Integer nivel,
        Integer ps) {
}
