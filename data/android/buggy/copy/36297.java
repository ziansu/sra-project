@java.lang.SuppressWarnings(value = "deprecation")
public boolean isWeekend(java.util.Date d) {
    return weekends[((d.getDay()) + (6 % 7))];
}