@java.lang.Override
public void onBackPressed() {
    android.util.Log.v(BezierGlobals.TAG, "%%%%%%%%%%%%%%> onBACKPressed");
    if ((this.task) != null) {
        this.task.setRunning(false);
    }
    super.onBackPressed();
}