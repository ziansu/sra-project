public static java.lang.String getNowDate() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss", java.util.Locale.US);
    java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis());
    return sdf.format(date);
}