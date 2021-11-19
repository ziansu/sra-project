private void failedAttempt(final java.lang.String theFailureMessage) {
    myErrorMessageLabel.setText(theFailureMessage);
    myLoginInputField.setText(view.LoginPanel.EXAMPLE_USERID_TEXT);
    myNewUserIDInputField.setText(view.LoginPanel.EXAMPLE_USERID_TEXT);
}