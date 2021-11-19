@java.lang.Override
public void onEventLongPress(com.alamkanak.weekview.WeekViewEvent event, android.graphics.RectF eventRect) {
    ShowDialog(event);
    events.remove(event);
    mWeekView.notifyDatasetChanged();
}