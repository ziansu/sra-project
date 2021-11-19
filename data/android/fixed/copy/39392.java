private java.lang.String squareRoot(java.lang.String x) {
    java.lang.Double d = getValue(x);
    java.math.BigDecimal k = new java.math.BigDecimal(java.lang.Math.sqrt(d), java.math.MathContext.DECIMAL64);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}