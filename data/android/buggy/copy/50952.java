@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scalar(double value, int offset) {
    return create(new double[]{ value }, new int[]{ 1 }, new int[]{ 1 }, offset);
}