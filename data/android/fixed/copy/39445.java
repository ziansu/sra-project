void setCoefficients(int[] coef) {
    for (int i = 0; i < (coef.length); i++) {
        coefficients.get(i).set(coef[i]);
    }
}