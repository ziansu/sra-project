@java.lang.Override
public org.ejml.simple.SimpleMatrix computeError(org.ejml.simple.SimpleMatrix delta) {
    error = delta.mult(activation.derivative(input.mult(thetas)));
    return delta;
}