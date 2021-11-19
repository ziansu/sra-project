public java.lang.String getStartTime() {
    java.util.Date tempDate = date.getTime();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
    return sdf.format(tempDate);
}