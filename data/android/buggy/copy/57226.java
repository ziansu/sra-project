private java.util.Date sqlDateToDate(java.lang.String sqlDate) {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try {
        java.util.Date date = dateFormat.parse(sqlDate);
        return date;
    } catch (java.text.ParseException e) {
    }
    return null;
}