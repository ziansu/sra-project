public double confidenceLo() {
    return (mean()) - (1.96 * (java.lang.Math.sqrt(((stddev()) / (percThreshold.length)))));
}