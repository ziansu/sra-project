public void addStatusEffect(com.tussle.fighter.StatusEffect newEffect) {
    this.addAction(newEffect);
    newEffect.onStart();
}