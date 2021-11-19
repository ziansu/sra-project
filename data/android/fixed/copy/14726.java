public static org.nd4j.linalg.api.ndarray.INDArray rand(int rows, int columns) {
    org.nd4j.linalg.api.ndarray.INDArray ret = org.nd4j.linalg.factory.Nd4j.INSTANCE.rand(rows, columns);
    org.nd4j.linalg.factory.Nd4j.logCreationIfNecessary(ret);
    return ret;
}