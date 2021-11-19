public java.lang.String SetFormatDate(java.util.Date paramdate, java.lang.String format) {
    return new java.text.SimpleDateFormat(format, new java.util.Locale("us", "us")).format(paramdate);
}