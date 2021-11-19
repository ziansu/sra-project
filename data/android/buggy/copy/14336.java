public static java.lang.String getDataStr(long time) {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
    return dateFormat.format(new java.util.Date());
}