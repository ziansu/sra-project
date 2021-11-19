private void modifyStrengthsAndRollModifier(int atkStr, int defStr, combatSystem.CombatObj combat) {
    applySpecialAttacks(combat);
    applyTerrainEffects(combat);
    applyUnitTypes(atkStr, defStr, combat);
}