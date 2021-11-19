public static org.nd4j.linalg.api.ndarray.INDArray rand(int[] shape) {
    org.nd4j.linalg.api.ndarray.INDArray ret = org.nd4j.linalg.factory.Nd4j.INSTANCE.rand(shape);
    org.nd4j.linalg.factory.Nd4j.logCreationIfNecessary(ret);
    return ret;
}