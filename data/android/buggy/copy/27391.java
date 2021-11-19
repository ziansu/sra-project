@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    com.shisy13.carefoot.view.MyWindowManager.removeSmallWindow(getApplicationContext());
    com.shisy13.carefoot.view.MyWindowManager.removeBigWindow(getApplicationContext());
    timer.cancel();
    timer = null;
}