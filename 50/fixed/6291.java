public static java.lang.String toString(java.util.Date date, java.lang.String pattern) {
    return date != null ? new java.text.SimpleDateFormat(pattern).format(date) : null;
}