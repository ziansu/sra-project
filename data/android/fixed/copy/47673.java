public double getDefendingEffectivenessAgainst(me.quadphase.qpdex.pokemon.Type attackingType) {
    me.quadphase.qpdex.databaseAccess.PokemonFactory pokemonFactory = me.quadphase.qpdex.databaseAccess.PokemonFactory.getPokemonFactory(null);
    return pokemonFactory.getTypeEffectivenessTable()[attackingType.getTypeID()][this.typeID];
}