private java.math.BigDecimal calculateScale() {
    return big(1).divide(big(2).pow(6), context);
}