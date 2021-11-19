public double getAttackingEffectivenessAgainst(me.quadphase.qpdex.pokemon.Type defendingType) {
    me.quadphase.qpdex.databaseAccess.PokemonFactory pokemonFactory = me.quadphase.qpdex.databaseAccess.PokemonFactory.getPokemonFactory(null);
    return pokemonFactory.getTypeEffectivenessTable()[this.typeID][defendingType.getTypeID()];
}