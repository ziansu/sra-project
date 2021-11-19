public static java.lang.String formatDate(long date, java.lang.String str) {
    return new java.text.SimpleDateFormat(str).format(new java.util.Date(date));
}