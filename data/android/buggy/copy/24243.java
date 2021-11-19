public void p2SuddenDeath(int hpChange) {
    setDivider(((currentMax) - (1 + (2 * hpChange))));
    changeGameLength(hpChange);
}