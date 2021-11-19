private void showNicknameTaken() {
    if (!(editTextNickname.getText().toString().trim().isEmpty())) {
        nicknameTaken = true;
        editTextNickname.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_error, 0);
    }
}