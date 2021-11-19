private java.util.Date date(java.lang.String s) {
    return java.util.Date.from(java.time.ZonedDateTime.parse("2016-01-01T12:15:00.000Z").toInstant());
}