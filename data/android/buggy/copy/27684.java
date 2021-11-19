public void changeStat(com.dd.Stats statChange) {
    addHealth(statChange.getHealth());
    addMaxHealth(statChange.getMaxHealth());
    addAttack(statChange.getAttack());
    addDefense(statChange.getDefense());
}