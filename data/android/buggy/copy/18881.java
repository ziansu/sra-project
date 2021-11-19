@java.lang.Override
public void run() {
    android.util.Log.e(com.junhzhan.cal.widget.CalendarWidgetNew.TAG, "change current month");
    mAdapter.increment();
}