private double getNewScore(org.nd4j.linalg.api.ndarray.INDArray oldParameters) {
    layer.setParams(oldParameters);
    return layer.score();
}