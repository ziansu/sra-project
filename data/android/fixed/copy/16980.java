@java.lang.Override
public java.util.Calendar getDefaultCheckoutDate() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(java.util.Calendar.DATE, 1);
    return calendar;
}