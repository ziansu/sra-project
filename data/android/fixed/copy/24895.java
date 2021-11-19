private double computeDropPropability(double density) {
    return density < (gamma_2) ? density : 1;
}