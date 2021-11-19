public float getLearningRate() {
    java.lang.Float r = _om.getFloat(getKey(io.agi.core.ann.unsupervised.GrowingNeuralGasConfig.LEARNING_RATE));
    return r.floatValue();
}