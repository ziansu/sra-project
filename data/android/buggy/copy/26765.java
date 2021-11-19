public int getEdgeMaxAge() {
    java.lang.Integer n = _om.getInteger(getKey(io.agi.core.ann.unsupervised.GrowingNeuralGasConfig.EDGE_MAX_AGE));
    return n.intValue();
}