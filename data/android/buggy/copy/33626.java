public void onClick(android.content.DialogInterface dialog, int arg1) {
    android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
    editor.putBoolean("EULA", false);
    editor.commit();
    finish();
}