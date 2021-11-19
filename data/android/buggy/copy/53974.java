public static java.util.Date makeLowerBound(java.util.Date startDate) {
    return new org.joda.time.DateTime(startDate).withTime(0, 0, 0, 0).toDate();
}