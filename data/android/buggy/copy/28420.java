private double calculateGradient(double[] oldState, double[] newState) {
    return ((double) (evaluation_.evaluate(newState))) - (evaluation_.evaluate(oldState));
}