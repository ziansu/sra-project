public void computePSF(final double[] alpha, final double[] beta, double deltaX, double deltaY) {
    computeDefocus(deltaX, deltaY, zdepth);
    setPhi(alpha);
    setRho(beta);
    computePSF();
}