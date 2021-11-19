public double modulus() {
    double a = getRe();
    double b = getIm();
    return java.lang.Math.sqrt(((a * a) + (b * b)));
}