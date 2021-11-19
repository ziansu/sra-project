public double threshold(double rawAxis) {
    if ((java.lang.Math.abs(rawAxis)) < 0.04) {
        return 0;
    }else {
        return 0.5 * rawAxis;
    }
}