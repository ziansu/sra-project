public java.lang.String formatDateToString(java.time.LocalDate localDate, java.time.chrono.Chronology outputChronology) {
    return formatDateToString(localDate, outputChronology, org.talend.dataquality.converters.DateCalendarConverter.DEFAULT_OUTPUT_PATTERN);
}