private org.joda.time.DateTime parseDay(org.joda.time.DateTime d, int days) {
    d = d.plusDays(days);
    return d;
}