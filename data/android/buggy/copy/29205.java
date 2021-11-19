private void calculateRange() {
    range = new java.math.BigDecimal(max);
    range = range.subtract(new java.math.BigDecimal(min));
}