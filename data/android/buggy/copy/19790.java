@java.lang.Override
public org.ejml.simple.SimpleMatrix computeError(org.ejml.simple.SimpleMatrix delta) {
    error = delta.elementMult(Utilities.DataSetUtilities.addColumnOfOnes(activation.derivative(input.mult(thetas))).transpose());
    return Utilities.DataSetUtilities.addColumnOfOnes(thetas).mult(error);
}