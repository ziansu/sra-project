private java.lang.String getDateTime() {
    java.util.Calendar c = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    java.lang.String strDate = sdf.format(c.getTime());
    return strDate;
}