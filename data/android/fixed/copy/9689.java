public static long getLocalDateFromUTC(long utcDate) {
    java.util.TimeZone tz = java.util.TimeZone.getDefault();
    long gmtOffset = tz.getOffset(utcDate);
    return utcDate + gmtOffset;
}