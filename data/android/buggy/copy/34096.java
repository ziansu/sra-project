@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if (!(s.equals(passwordEditText.getText().toString()))) {
        confirmPasswordEditText.setError("Passwords don't match");
    }
}