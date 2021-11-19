public double getPeptideScore() {
    zooActivateRead();
    return eu.isas.peptideshaker.parameters.PSParameter.getScore(peptideProbabilityScore);
}