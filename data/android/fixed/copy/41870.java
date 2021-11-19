public static java.lang.String getTimeString(java.util.Date date) {
    java.text.DateFormat dateFormat = java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT, net.sf.memoranda.util.Local.currentLocale);
    return dateFormat.format(date);
}