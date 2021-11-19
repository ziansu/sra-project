@java.lang.Override
protected void onStart() {
    super.onStart();
    if (checkAndRequestPermissions()) {
        saveButton.setEnabled(true);
    }
}