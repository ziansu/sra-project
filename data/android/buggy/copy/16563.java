public double confidenceHi() {
    return (mean()) + (1.96 * (java.lang.Math.sqrt(((stddev()) / (percThreshold.length)))));
}