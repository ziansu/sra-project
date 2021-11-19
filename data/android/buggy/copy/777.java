public static int timeBetweenInDays(long prevDate) {
    long diff = (java.lang.System.currentTimeMillis()) - prevDate;
    diff /= android.text.format.DateUtils.DAY_IN_MILLIS;
    return ((int) (diff));
}