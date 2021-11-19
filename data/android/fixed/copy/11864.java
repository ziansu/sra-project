@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void run() {
    try {
        someTask();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}