public int calculateDefenceAgainstMissilesSkill() {
    int defence = calculateDefenceSkill();
    defence = modifyValue(AbilityCommand.MODIFY_MISSILE_DEFENCE, defence);
    return defence;
}