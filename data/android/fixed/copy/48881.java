@java.lang.Override
public void handleMessage(android.os.Message msg) {
    timerMessage = "" + (msg.obj);
    tvTimer.setText(timerMessage);
}