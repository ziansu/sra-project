private void verifyEqualityConstraintsHold(int numberOfEqualityConstraints, org.ejml.data.DenseMatrix64F linearEqualityConstraintsAMatrix, org.ejml.data.DenseMatrix64F linearEqualityConstraintsBVector, org.ejml.data.DenseMatrix64F solutionMatrix) {
    double maxAbsoluteError = getMaxEqualityConstraintError(numberOfEqualityConstraints, linearEqualityConstraintsAMatrix, linearEqualityConstraintsBVector, solutionMatrix);
    org.junit.Assert.assertEquals(0.0, maxAbsoluteError, 1.0E-5);
}