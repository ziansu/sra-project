@java.lang.Override
protected void onStart() {
    super.onStart();
    if (checkAndRequestPermissions()) {
        saveButton.setEnabled(true);
    }
    if ((dbHelper.getContacts().size()) == 0) {
        first_time_saved = true;
    }
}