public void addStatusEffect(com.tussle.fighter.StatusEffect newEffect) {
    newEffect.onStart();
    this.addAction(newEffect);
}