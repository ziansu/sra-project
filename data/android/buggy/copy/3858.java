@java.lang.Override
public void run() {
    android.widget.TextView textTime = ((android.widget.TextView) (findViewById(R.id.timer)));
    textTime.setText((((getString(R.string.play_activity_time)) + " ") + (seconds)));
}