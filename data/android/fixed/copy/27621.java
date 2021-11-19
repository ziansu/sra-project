public static java.lang.String getCurrentDateAndTime() {
    java.text.DateFormat dateWithTime = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    return dateWithTime.format(new java.util.Date());
}