public int calculateDenominator(int denominator, int maxNum) {
    int den = denominator;
    if ((den > (maxNum / 2)) || (den == 0)) {
        den = (den + 1) / 2;
    }
    return den;
}