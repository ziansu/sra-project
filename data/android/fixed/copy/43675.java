public void error(java.lang.String message, java.lang.Throwable t) {
    stdErr.println(("ERROR: " + message));
    if (displayStackTrace) {
        t.printStackTrace(stdErr);
    }
}