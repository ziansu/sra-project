@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    listener.onCancel(this);
    if ((mThread) != null) {
        mThread.interrupt();
        mThread = null;
    }
}