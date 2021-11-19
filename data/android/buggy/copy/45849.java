public nl.bknopper.tspeademo.ea.CandidateSolution getCurrentBest() throws java.lang.IllegalStateException {
    if (((population) == null) || (population.isEmpty())) {
        throw new java.lang.IllegalStateException("There is no algorithm running at this point in time!");
    }
    return population.get(0);
}