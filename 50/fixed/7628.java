private java.lang.String time() {
    java.util.Date d = new java.util.Date();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
    return sdf.format(new java.util.Date(d.getTime()));
}