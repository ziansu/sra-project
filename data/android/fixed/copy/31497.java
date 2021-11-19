public void setDesiredConfiguration(org.ejml.data.DenseMatrix64F q, int startIndex) {
    desiredConfiguration.reshape(7, 1);
    org.ejml.ops.CommonOps.extract(q, startIndex, (startIndex + 7), 0, 1, desiredConfiguration, 0, 0);
}