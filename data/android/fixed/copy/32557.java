private static org.nd4j.linalg.api.complex.IComplexNDArray createComplex(float[] data, char order) {
    org.nd4j.linalg.api.complex.IComplexNDArray ret = org.nd4j.linalg.factory.Nd4j.INSTANCE.createComplex(data, order);
    org.nd4j.linalg.factory.Nd4j.logCreationIfNecessary(ret);
    return ret;
}