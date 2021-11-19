public static java.lang.String getDate() {
    java.util.Date date = new java.util.Date();
    java.text.Format dateFormat = new java.text.SimpleDateFormat("yyyy.MM.dd");
    java.lang.String currentDate = dateFormat.format(date);
    return currentDate;
}