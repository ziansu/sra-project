@java.lang.Override
public void onPause() {
    int positie = s.getSelectedItemPosition();
    android.content.SharedPreferences.Editor editor = savedValues.edit();
    editor.putInt("spinnerPositie", positie);
    editor.commit();
    super.onPause();
}