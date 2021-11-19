@java.lang.Override
public void onBackPressed() {
    finish();
    if ((wr) != null)
        wr.disconnect();
    
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onBackPressed();
}