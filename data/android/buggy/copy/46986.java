@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(4000);
        myHandler.sendEmptyMessage(com.ps.app.ui.activity.Splash.DISMISS_PROGRESSBAR);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}