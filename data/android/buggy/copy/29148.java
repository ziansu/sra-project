@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    prefs.edit().putString(java.lang.String.valueOf(editText.getId()), s.toString()).apply();
}