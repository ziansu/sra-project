public void attendenceChecks() {
    today = dateParser.getDay(new org.joda.time.DateTime());
    dateParser.recordAbsence(user, today);
}