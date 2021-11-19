protected void applyStatusEffect(int entityID, gg.al.logic.component.data.StatusEffect effect, java.lang.String effectName) {
    gg.al.logic.component.StatComponent statComponent = getComponent(entityID, gg.al.logic.component.StatComponent.class);
    if (statComponent != null)
        statComponent.statusEffects.put(effectName, effect);
    
}