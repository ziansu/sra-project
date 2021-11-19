public int chooseRandom(java.util.List<java.lang.Integer> conflicts) {
    return this.chooseRandomExcluding((-1), conflicts, false);
}