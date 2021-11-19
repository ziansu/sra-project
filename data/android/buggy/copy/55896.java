private static java.lang.String getUtcTime() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
    java.lang.String dateTimeString = sdf.format(new java.util.Date());
    return dateTimeString;
}