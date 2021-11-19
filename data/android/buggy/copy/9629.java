@java.lang.Override
public void run() {
    if (((mSnackbar) != null) && (mSnackbar.isShown())) {
        this.sendEvent(com.lugg.ReactSnackbar.ReactSnackbarModule.EVENT_HIDE, null);
    }
}