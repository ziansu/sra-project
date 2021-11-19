public void setFatalError(java.lang.Throwable t, java.lang.String message) {
    hasFatalError.set(true);
    this.fatalError = t;
    this.fatalErrorMessage = message;
}