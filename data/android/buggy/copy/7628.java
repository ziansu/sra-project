public java.lang.String time() {
    java.util.Date d = new java.util.Date();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
    java.lang.String time = sdf.format(new java.util.Date(d.getTime()));
    return time;
}