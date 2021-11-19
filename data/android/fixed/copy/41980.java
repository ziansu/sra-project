protected void onDayTapped(com.andexert.calendarlistview.library.SimpleMonthAdapter.CalendarDay calendarDay) {
    mController.onDayOfMonthSelected(calendarDay.year, calendarDay.month, calendarDay.day);
    setSelectedDay(calendarDay);
}