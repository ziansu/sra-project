public java.lang.String getCreationTime() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
    java.util.Date dt = new java.util.Date();
    return sdf.format(dt);
}