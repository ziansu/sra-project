@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray setGradientFor(java.lang.String variable, org.nd4j.linalg.api.ndarray.INDArray newGradient) {
    org.nd4j.linalg.api.ndarray.INDArray last = gradients.put(variable, newGradient);
    flattenGradient();
    return last;
}