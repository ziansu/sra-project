@java.lang.Override
public void onMinuteSelected(int mMinute) {
    minuteSelected = mMinute;
    minute.add(minuteSelected);
    for (int minutes : minute) {
        android.util.Log.i("Minutes: ", java.lang.String.valueOf(minutes));
    }
}