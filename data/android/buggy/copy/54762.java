public java.util.Date getEndDate() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(mDate);
    calendar.add(java.util.Calendar.DAY_OF_MONTH, mDays);
    return calendar.getTime();
}