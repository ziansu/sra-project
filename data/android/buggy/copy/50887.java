public static java.lang.String dateTimeMillisFromEpoch(long epoch) {
    jwh1807.util.LocalDateTime dt = new jwh1807.util.LocalDateTime();
    org.joda.time.format.DateTimeFormatter fmt = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");
    return dt.toString(fmt);
}