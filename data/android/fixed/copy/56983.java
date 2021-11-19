@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = false;
    }
}