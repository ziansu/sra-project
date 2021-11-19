public double Exponential(float mu) {
    RandomNumber();
    RandomNumber();
    return (-mu) * (java.lang.Math.log((1 - (RandomNumber()))));
}