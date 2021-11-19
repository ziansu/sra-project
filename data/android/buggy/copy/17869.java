public int getIntervalHours(java.util.Date startTime, java.util.Date endTime) {
    org.joda.time.DateTime startDateTime = new org.joda.time.DateTime(startTime);
    org.joda.time.DateTime endDateTime = new org.joda.time.DateTime(endTime);
    return org.joda.time.Hours.hoursBetween(startDateTime.withTimeAtStartOfDay(), endDateTime).getHours();
}