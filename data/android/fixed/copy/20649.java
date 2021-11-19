@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = true;
    }
}