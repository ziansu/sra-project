public static me.corriekay.pokegoutil.utils.pokemon.PokemonPerformanceStats getStats(final POGOProtos.Enums.PokemonIdOuterClass.PokemonId pokemonId) {
    final int HIGHEST_STATS = 1;
    return me.corriekay.pokegoutil.utils.pokemon.PokemonPerformanceCache.MAP.get(pokemonId);
}