private double calcRico2(int ppmValue) {
    return (PPMMinusMeanTimesDDFMinusMean(ppmValue)) / (DDFMinusMeanSquared());
}