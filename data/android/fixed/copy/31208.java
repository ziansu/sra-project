public static java.lang.String formatTime(android.content.Context context, long timeInMs, java.lang.String timeZone) {
    return org.mtransit.android.commons.TimeUtils.formatTime(context, timeInMs, java.util.TimeZone.getTimeZone(timeZone));
}