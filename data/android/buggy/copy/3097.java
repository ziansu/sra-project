@java.lang.Override
public eu.amidst.core.models.BayesianNetwork getLearntBayesianNetwork() {
    eu.amidst.core.exponentialfamily.SufficientStatistics normalizedSS = efBayesianNetwork.createZeroSufficientStatistics();
    normalizedSS.copy(sumSS);
    normalizedSS.divideBy(numInstances);
    efBayesianNetwork.setMomentParameters(normalizedSS);
    return efBayesianNetwork.toBayesianNetwork(dag);
}