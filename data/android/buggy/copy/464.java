public void calculateOutputError(double y) {
    error = ((activation) - y) * (sigmoidPrime(z));
}