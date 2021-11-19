public double pow(double x, int n) {
    if (n < 0) {
        return 1 / (power(x, (-n)));
    }else {
        return power(x, n);
    }
}