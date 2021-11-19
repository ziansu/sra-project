public java.lang.String createIdentifyer(final java.lang.String logbook) {
    final java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(":yyMMdd-HH:mm:ss");
    java.lang.String id = null;
    id = logbook + (dateFormat.format(cal.getTime()));
    return id;
}