private java.time.LocalDate getModelDate(double fixingTime) {
    return referenceDate.plusDays(java.lang.Math.round(((float) (fixingTime * 365.0))));
}