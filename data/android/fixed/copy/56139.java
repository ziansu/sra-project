private void notifyError(int resourceString, java.lang.String error) {
    txtPassword.setText("");
    java.lang.String msgError = java.lang.String.format(getString(resourceString), error);
    txtPassword.setError(msgError);
}