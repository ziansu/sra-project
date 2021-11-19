public java.lang.String getDate() {
    java.util.Date date = new java.util.Date();
    java.lang.String modifiedDate = ((java.lang.String) (new java.text.SimpleDateFormat("yyyy/MM/dd").format(date)));
    return modifiedDate;
}