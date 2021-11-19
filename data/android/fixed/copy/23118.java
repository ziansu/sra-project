public double alphaCalc(com.samvbeckmann.machinelearning.reinforcement.simulation.Board state, int action) {
    return 1.0 / (getCorrectInfoPair(state, action).timesVisited);
}