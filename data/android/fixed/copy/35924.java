public java.lang.String getTime() {
    java.lang.String tmpTime = time;
    if (tmpTime == null) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
        tmpTime = sdf.format(new java.util.Date());
        time = tmpTime;
    }
    return tmpTime;
}