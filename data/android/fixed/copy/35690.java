static org.nd4j.linalg.api.ndarray.INDArray invert(org.nd4j.linalg.api.ndarray.INDArray arr1) {
    return org.nd4j.examples.numpy_cheatsheat.CustomOperations.booleanOp(arr1, org.nd4j.linalg.indexing.conditions.Conditions.equals(0));
}