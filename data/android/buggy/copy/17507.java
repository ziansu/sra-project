@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((s.toString().length()) > 0) {
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
    }
}