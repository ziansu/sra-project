public java.lang.String getErrorTextFromException(java.lang.Exception e) {
    java.lang.String message = e.getMessage();
    if (message == null) {
        message = "(No exception message available)";
        log.error(message, e);
    }
    return message;
}