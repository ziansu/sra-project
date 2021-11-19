public double getCurrent() {
    double answer = (shooterMotorA.getOutputCurrent()) + (shooterMotorB.getOutputCurrent());
    answer /= 2.0;
    return answer;
}