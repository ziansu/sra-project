@java.lang.Override
public void init(org.nd4j.linalg.api.ndarray.INDArray arr, int begin, int dimension) {
    this.begin = 0;
    this.end = arr.size(dimension);
}