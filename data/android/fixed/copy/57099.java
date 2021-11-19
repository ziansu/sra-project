@java.lang.Override
public void run() {
    ((android.widget.TextView) (findViewById(R.id.passingTime))).setText(java.lang.String.valueOf(seconds));
    (seconds)++;
    timerHandler.postDelayed(this, 1000);
}