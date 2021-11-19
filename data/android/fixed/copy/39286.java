@java.lang.Override
public void onCancel() {
    clearHandlers();
    if ((fsiActivity) != null) {
        fsiActivity.onCancel();
    }
    if ((jsActivity) != null) {
        jsActivity.onCancel();
    }
}