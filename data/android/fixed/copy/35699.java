public int getFirstDayOfMonth(Time time) {
    java.util.Calendar cal = time.temp;
    cal.set(java.util.Calendar.DAY_OF_MONTH, 0);
    return cal.get(java.util.Calendar.DAY_OF_WEEK);
}