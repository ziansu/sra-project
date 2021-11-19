@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.content.SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.clear().commit();
    resetList();
}