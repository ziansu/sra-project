public boolean isPositive(java.math.BigDecimal value) {
    if (value == null) {
        return true;
    }
    return (value.compareTo(java.math.BigDecimal.ZERO)) <= 0;
}