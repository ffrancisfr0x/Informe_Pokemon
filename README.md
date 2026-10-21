# Informe de Pokémon

## Descripción

Aplicación Java que carga información de Pokémon desde un archivo JSON, calcula diferentes estadísticas y genera un informe de texto con los resultados obtenidos.

## Funcionalidades

- Carga de datos desde `pokemon.json`.
- Cálculo del número total de Pokémon.
- Cálculo del nivel medio.
- Cálculo de los PS medios.
- Obtención del Pokémon con mayor nivel.
- Obtención del Pokémon con más PS.
- Conteo de Pokémon agrupados por tipo.
- Listado de Pokémon agrupados por tipo.
- Generación del archivo `pokemon.txt`.

## Funcionalidades

- Carga de datos desde `pokemon.json`.
- Cálculo del número total de Pokémon.
- Cálculo del nivel medio.
- Cálculo de los PS medios.
- Obtención del Pokémon con mayor nivel.
- Obtención del Pokémon con más PS.
- Conteo de Pokémon agrupados por tipo.
- Listado de Pokémon agrupados por tipo.
- Generación del archivo `pokemon.txt`.

## Formato del JSON
Cada Pokémon se divide en:
- id
- nombre
- tipo
- nivel
- ps

Ejemplo:

```json
[
  {
    "id":1,
    "nombre":"Bulbasaur",
    "tipo":"PLANTA",
    "nivel":12,
    "ps":45
  }
]
```

