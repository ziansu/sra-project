@java.lang.Override
public void run() {
    if ((mSnackbar) != null) {
        this.sendEvent(com.lugg.ReactSnackbar.ReactSnackbarModule.EVENT_HIDE, null);
    }
}