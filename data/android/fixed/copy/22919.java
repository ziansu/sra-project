public static long getDateDiff(java.util.Date date1, java.util.Date date2, java.util.concurrent.TimeUnit timeUnit) {
    long diffInMillies = (date1.getTime()) - (date2.getTime());
    return timeUnit.convert(diffInMillies, java.util.concurrent.TimeUnit.MILLISECONDS);
}