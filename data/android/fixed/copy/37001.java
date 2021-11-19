private void showNicknameAvailable() {
    if (!(editTextNickname.getText().toString().trim().isEmpty())) {
        nicknameTaken = false;
        editTextNickname.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check, 0);
    }
}