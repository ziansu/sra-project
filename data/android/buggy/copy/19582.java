private static java.lang.String generateByBigDecimal(java.lang.String a, java.lang.String b) {
    java.math.BigDecimal b1 = new java.math.BigDecimal(a);
    java.math.BigDecimal b2 = new java.math.BigDecimal(b);
    return b1.add(b2).toString();
}