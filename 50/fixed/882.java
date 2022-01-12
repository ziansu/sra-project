protected boolean sellOrderSufficientFunds(java.math.BigDecimal totalProceeds) {
    return (totalProceeds.compareTo(new java.math.BigDecimal(0))) != 0;
}