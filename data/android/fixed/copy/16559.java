@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    if ((mThread) != null) {
        mThread.interrupt();
        mThread = null;
    }
}