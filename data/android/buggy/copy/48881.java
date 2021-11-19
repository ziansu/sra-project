@java.lang.Override
public void handleMessage(android.os.Message msg) {
    java.lang.String timerMessage = "" + (msg.obj);
    tvTimer.setText(timerMessage);
}