private void handleClose() {
    commitTyped(getCurrentInputConnection());
    requestHideSelf(0);
}