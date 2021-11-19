@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = false;
        android.widget.Toast.makeText(this, "Stopped", Toast.LENGTH_SHORT).show();
    }
}