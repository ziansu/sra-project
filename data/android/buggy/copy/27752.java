private void verifyInequalityConstraintsHold(int numberOfEqualityConstraints, org.ejml.data.DenseMatrix64F linearInequalityConstraintsCMatrix, org.ejml.data.DenseMatrix64F linearInequalityConstraintsDVector, org.ejml.data.DenseMatrix64F solutionMatrix) {
    double maxSignedError = getMaxInequalityConstraintError(numberOfEqualityConstraints, linearInequalityConstraintsCMatrix, linearInequalityConstraintsDVector, solutionMatrix);
    org.junit.Assert.assertTrue((maxSignedError < 1.0E-10));
}