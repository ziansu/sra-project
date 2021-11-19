public static net.sf.memoranda.date.CalendarDate tomorrow() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.roll(java.util.Calendar.DATE, true);
    return new net.sf.memoranda.date.CalendarDate(cal);
}