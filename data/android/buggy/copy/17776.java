private java.lang.String getDateTime() {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault());
    java.util.Date date = new java.util.Date();
    return dateFormat.format(date);
}