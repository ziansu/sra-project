public static int timeBetweenInDays(long prevDate) {
    long diff = (java.lang.System.currentTimeMillis()) - prevDate;
    return ((int) (diff / (android.text.format.DateUtils.DAY_IN_MILLIS)));
}