public double confidenceHi() {
    return (this.mean()) + (((java.lang.Math.sqrt(this.stddev())) * 1.96) / (java.lang.Math.sqrt(T)));
}