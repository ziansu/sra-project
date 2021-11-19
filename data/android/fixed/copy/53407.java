protected void assertBigDecimal(final java.math.BigDecimal v1, final java.math.BigDecimal v2) {
    assertTrue("BigDecimal values are not equal.", ((v1.compareTo(v2)) == 0));
}