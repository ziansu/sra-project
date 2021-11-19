public static long removeTimezone(long timestamp) {
    java.util.TimeZone tz = org.isoron.uhabits.utils.DateUtils.getTimezone();
    return timestamp + (tz.getOffset(timestamp));
}