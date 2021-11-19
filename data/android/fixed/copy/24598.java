public void setError(java.lang.String errorText) {
    this.errorText = errorText;
    if (asserter.assertPointerQuietly(error)) {
        error.setText(errorText);
    }
    internalSetError();
}