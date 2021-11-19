public static long nanosFromDate(long ms) {
    java.util.Calendar cal = org.h2.util.DateTimeUtils.getCalendar();
    cal.clear();
    cal.setTimeInMillis(ms);
    return org.h2.util.DateTimeUtils.nanosFromCalendar(cal);
}