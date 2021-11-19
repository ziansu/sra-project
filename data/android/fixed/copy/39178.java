public double getCappedProgression(long currentValue) {
    return java.lang.Math.max(0, java.lang.Math.min(1.0, ((currentValue - (mStart)) / ((float) (mRange)))));
}