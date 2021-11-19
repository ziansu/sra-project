@java.lang.Override
protected int idamax(int N, org.nd4j.linalg.api.ndarray.INDArray X, int incX) {
    return (org.jblas.NativeBlas.idamax(N, org.nd4j.linalg.api.blas.BlasBufferUtil.getDoubleData(X), org.nd4j.linalg.api.blas.BlasBufferUtil.getBlasOffset(X), incX)) - 1;
}