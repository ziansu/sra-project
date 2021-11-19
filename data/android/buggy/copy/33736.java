@java.lang.Override
public void onSelectDate(java.util.Date date, android.view.View view) {
    setSelectedDate(date);
    if ((calendarListener) != null) {
        calendarListener.onSelectDate(date);
    }
}