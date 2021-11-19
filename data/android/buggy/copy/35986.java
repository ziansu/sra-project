@java.lang.Override
public void onDaySelected(kr.djsch.dsmhs.beinone.materialcalendar.DayView v, java.util.Calendar calendar) {
    clearDayViews();
    v.setSelected(true);
    if ((mOnSelectedDayChangedListener) != null) {
        mOnSelectedDayChangedListener.onSelectedDayChanged(calendar.getTime());
    }
}