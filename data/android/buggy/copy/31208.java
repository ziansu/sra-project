public static java.lang.String formatTime(android.content.Context context, long timeInMs, java.lang.String timeZone) {
    org.mtransit.android.commons.ThreadSafeDateFormatter df = org.mtransit.android.commons.TimeUtils.getFormatTime(context, timeInMs);
    df.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
    return df.formatThreadSafe(timeInMs);
}