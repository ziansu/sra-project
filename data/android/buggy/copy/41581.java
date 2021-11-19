private boolean handleException(final java.lang.Throwable ex) {
    if (ex == null) {
        return false;
    }
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            saveLocal(writeLogIntoMarkdown(ex));
        }
    }.start();
    return true;
}