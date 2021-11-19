@java.lang.Override
public void handleMessage(android.os.Message msg) {
    float second = ((float) (msg.obj));
    if ((youTubeListener) != null) {
        youTubeListener.onCurrentSecond(second);
    }
}