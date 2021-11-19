public static long getUTCDateFromLocal(long localDate) {
    java.util.TimeZone tz = java.util.TimeZone.getDefault();
    long gmtOffset = tz.getOffset(localDate);
    return localDate + gmtOffset;
}