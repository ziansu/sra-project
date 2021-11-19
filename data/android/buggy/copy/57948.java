private org.joda.time.LocalDate estimateFromAncestorsBirth(final org.joda.time.LocalDate date, final org.schoellerfamily.gedbrowser.datamodel.Person parent) {
    if ((parent == null) || (date != null)) {
        return date;
    }
    final org.schoellerfamily.gedbrowser.analytics.BirthDateEstimator bde = createEstimator(parent);
    return estimateFromAncestorsBirth(date, bde);
}