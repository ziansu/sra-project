private int doDatesMatch(java.util.Calendar date1Calendar, java.util.Calendar date2Calendar) {
    int date1Day = date1Calendar.get(java.util.Calendar.DAY_OF_YEAR);
    int date2Day = date2Calendar.get(java.util.Calendar.DAY_OF_YEAR);
    return date1Day < date2Day ? -1 : date1Day == date2Day ? 0 : 1;
}