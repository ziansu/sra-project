public void spellCast(int spellDamage, int speelDamageDuration) {
    if (((this.debuffDamage) < spellDamage) || ((this.debuffDuration) < speelDamageDuration)) {
        this.debuffDamage = spellDamage;
        this.debuffDuration = speelDamageDuration;
    }
}