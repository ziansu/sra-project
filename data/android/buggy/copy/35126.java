public pokedex.Pokemon createPokemon(java.lang.String name, int level) {
    java.lang.System.out.println(pokemonData);
    return new pokedex.Pokemon(pokemonData.get(name), level);
}