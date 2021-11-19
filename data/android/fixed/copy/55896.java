private static java.lang.String getUtcTime() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
    return sdf.format(new java.util.Date());
}