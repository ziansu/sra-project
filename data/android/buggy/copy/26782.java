@java.lang.Override
public void handleMessage(android.os.Message msg) {
    float second = ((float) (msg.obj));
    youTubeListener.onCurrentSecond(second);
}