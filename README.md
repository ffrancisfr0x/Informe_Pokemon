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

## Ejecución

1. Colocar el archivo `pokemon.json`.
2. Ejecutar la clase `Main`.
3. El programa generará automáticamente el archivo: `pokemon.txt`

## Ejemplo de salida

```text
=============================
INFORME DE POKEMON
=============================

Total de Pokémon: 3002
Nivel medio: 19
PS medios: 60
Pokemon con mayor nivel: Charizard(36)
Pokemon con mas PS: Wigglytuff(140)


=============================

POKEMON POR TIPO
=============================

ELECTRICO: 2
Pikachu
Raichu

VENENO: 10
Ekans
Arbok
NidoranF
Nidorina
Nidoqueen
NidoranM
Nidorino
Nidoking
Zubat
Golbat

PLANTA: 6
Bulbasaur
Ivysaur
Venusaur
Oddish
Gloom
Vileplume

BICHO: 10
Caterpie
Metapod
Butterfree
Weedle
Kakuna
Beedrill
Paras
Parasect
Venonat
Venomoth

HADA: 4
Clefairy
Clefable
Jigglypuff
Wigglytuff

FUEGO: 5
Charmander
Charmeleon
Charizard
Vulpix
Ninetales

AGUA: 3
Squirtle
Wartortle
Blastoise

VOLADOR: 5
Pidgey
Pidgeotto
Pidgeot
Spearow
Fearow

TIERRA: 3
Sandshrew
Sandslash
Diglett

NORMAL: 2
Rattata
Raticate
```
