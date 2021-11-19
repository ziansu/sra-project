public boolean isThereIncompleteAbrechnung() {
    java.math.BigDecimal totalBrutto = incompleteAbrechnungsTotals.get(0);
    return (totalBrutto.signum()) > 0;
}