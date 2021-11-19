@java.lang.Override
public void onCalendarDateSelected(com.junhzhan.cal.data.CalendarItem item) {
    setDate(item.year, item.month, item.date);
    mList.setDate(item);
    if ((mOutListener) != null) {
        mOutListener.onCalendarDateSelected(item);
    }
}