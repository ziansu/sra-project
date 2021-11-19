@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scalar(float value, int offset) {
    return create(new float[]{ value }, new int[]{ 1 }, new int[]{ 1 }, offset);
}