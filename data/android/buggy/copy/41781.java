public double getRabattPris(double inp) {
    double sum = inp;
    sum = rabatt.getRabatteratPris(sum);
    return sum;
}