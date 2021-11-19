public static int calculateTimeSpan(java.util.Date start, java.util.Date end, java.time.temporal.ChronoUnit unit) {
    return java.lang.Math.toIntExact(unit.between(utils.DateTimeUtils.toLocalDate(start), utils.DateTimeUtils.toLocalDate(end)));
}