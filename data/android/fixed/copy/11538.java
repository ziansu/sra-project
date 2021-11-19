public static net.sf.memoranda.date.CalendarDate yesterday() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.add(java.util.Calendar.DATE, (-1));
    return new net.sf.memoranda.date.CalendarDate(cal);
}