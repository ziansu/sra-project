public java.lang.String getCreated() {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd.MM.yyyy");
    return simpleDateFormat.format(created);
}