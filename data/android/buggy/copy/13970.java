@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putString("max_runtime", s.toString());
    editor.commit();
}