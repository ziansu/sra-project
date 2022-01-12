private void menuLoadContacts(java.lang.String toastText) {
    kobeissidev.autobirthday.Settings.loadContacts(getApplicationContext(), dbHandler);
    android.widget.Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    finish();
    startActivity(getIntent());
}