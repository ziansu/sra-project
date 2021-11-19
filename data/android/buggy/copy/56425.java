public Money<java.lang.Integer> toDesiredRate(java.lang.String desiredCurrency, Money<java.lang.Integer> UsBaseAmount) {
    int scalar = toCents(desiredCurrency);
    return toDesiredDollars(desiredCurrency, UsBaseAmount);
}