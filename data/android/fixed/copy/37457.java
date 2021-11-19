public int roll() {
    state = ((int) ((java.lang.Math.random()) * (numSides))) + 1;
    return state;
}