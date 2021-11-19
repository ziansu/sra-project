@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    kobeissidev.autobirthday.Settings.loadContacts(getApplicationContext(), dbHandler);
    finish();
    startActivity(getIntent());
}