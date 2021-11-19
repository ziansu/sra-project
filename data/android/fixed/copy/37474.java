private org.joda.time.DateTime initializeDateTime() {
    org.joda.time.DateTime d = new org.joda.time.DateTime();
    d = d.withHourOfDay(23);
    d = d.withMinuteOfHour(59);
    return d;
}