private boolean hasBattleTrappingAbility(com.dabomstew.pkrandom.pokemon.Pokemon pokemon) {
    return (pokemon != null) && ((Gen3Constants.battleTrappingAbilities.contains(pokemon.ability1)) || (Gen3Constants.battleTrappingAbilities.contains(pokemon.ability2)));
}