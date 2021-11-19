@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray epsi(java.lang.Number other) {
    org.nd4j.linalg.api.ndarray.INDArray otherArr = org.nd4j.linalg.factory.Nd4j.valueArrayOf(shape(), other.doubleValue());
    return eps(otherArr);
}