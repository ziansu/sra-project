public boolean applies(battle.Battle b, pokemon.ActivePokemon user, pokemon.ActivePokemon victim) {
    return (!(user.fullHealth())) && (!(user.hasEffect(EffectNamesies.HEAL_BLOCK)));
}