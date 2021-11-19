private java.math.BigDecimal calculateRight0(java.math.BigDecimal n) {
    return big(2).pow(5).divide(big(4).multiply(n).add(big(1)), context).negate();
}