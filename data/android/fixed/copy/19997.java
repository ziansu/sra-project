public void attack(characterEntities.Ability ability) {
    if ((getEntityState()) == (EntityState.NEUTRAL)) {
        playAnimation(ability.getValue());
        setEntityState(EntityState.ATTACKING);
    }
}