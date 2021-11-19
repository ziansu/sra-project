public void setDisplayFormat(int minIntegerDigits, int maxIntegerDigits, int minFractionDigits, int maxFractionDigits) {
    formatter.setMinimumIntegerDigits(minIntegerDigits);
    formatter.setMaximumIntegerDigits(maxIntegerDigits);
    formatter.setMinimumFractionDigits(minFractionDigits);
    formatter.setMaximumFractionDigits(maxFractionDigits);
}