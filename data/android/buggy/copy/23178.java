private java.time.LocalDate getModelDate(double fixingTime) {
    return referenceDate.plusDays(((int) (fixingTime * 365.0)));
}