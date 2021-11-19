private double RQ(org.apache.commons.math3.linear.RealMatrix A, org.apache.commons.math3.linear.RealVector x) {
    return (x.dotProduct(A.operate(x))) / (x.getNorm());
}