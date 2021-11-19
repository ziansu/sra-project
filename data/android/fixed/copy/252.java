@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scalar(int value, int offset) {
    return create(new int[]{ value }, new int[]{ 1 , 1 }, new int[]{ 1 , 1 }, offset);
}