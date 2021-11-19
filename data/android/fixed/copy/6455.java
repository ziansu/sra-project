protected void logError(int position, java.lang.String message) {
    boolean prev = log.multipleErrors;
    log.multipleErrors = true;
    try {
        log.error(position, "ceylon", message);
    } finally {
        log.multipleErrors = prev;
    }
}