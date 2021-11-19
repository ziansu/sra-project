public static int getDaysOfMonth(int yy, int mm) {
    java.util.Calendar oCal = new java.util.GregorianCalendar(yy, (mm - 1), 1);
    return oCal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
}