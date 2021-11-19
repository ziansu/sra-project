public nl.bknopper.tspeademo.ea.CandidateSolution getCurrentBest() throws java.lang.IllegalStateException {
    return population.isEmpty() ? null : population.get(0);
}