@java.lang.Override
public void uncaughtException(java.lang.Thread thread, java.lang.Throwable throwable) {
    stop();
    throwable.printStackTrace();
    android.util.Log.e(logTag, throwable.getLocalizedMessage());
}