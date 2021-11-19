private bot.integer countZealots() {
    int zealots = 0;
    for (jnibwapi.Unit unit : idleUnits()) {
        if ((unit.getType()) == (jnibwapi.types.UnitType.UnitTypes.Protoss_Zealot)) {
            zealots += 1;
        }
    }
}