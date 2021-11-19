@java.lang.Override
protected void onPostExecute(final java.lang.Boolean success) {
    mAuthTask = null;
    showProgress(false, 0);
    if (success) {
        finish();
    }else {
        mPasswordView.setError(getString(R.string.error_incorrect_password));
        mPasswordView.requestFocus();
    }
}