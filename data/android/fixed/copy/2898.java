@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray preOutput(org.nd4j.linalg.api.ndarray.INDArray x) {
    return preOutput(x, TrainingMode.TRAIN);
}