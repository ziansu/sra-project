private org.openhab.core.library.types.DateTimeType getDateTimeType(java.util.Date dateAsDate) {
    return new org.openhab.core.library.types.DateTimeType(java.util.Calendar.getInstance().setTime(date));
}