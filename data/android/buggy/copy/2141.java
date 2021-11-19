public com.kongzue.dialog.InputDialog show() {
    if ((com.kongzue.dialog.InputDialog.context) == null) {
        com.kongzue.dialog.util.Log.println("Error:context is null,please init Dialog first.");
        return null;
    }
    com.kongzue.dialog.InputDialog.doShow();
    return this;
}