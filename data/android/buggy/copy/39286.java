@java.lang.Override
public void onCancel() {
    clearHandlers();
    fsiActivity.onCancel();
    jsActivity.onCancel();
}