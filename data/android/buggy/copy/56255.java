@java.lang.Override
public void onActivityPaused(android.app.Activity activity) {
    android.util.Log.i("BACKGROUND", "pause");
    ++(pause);
}