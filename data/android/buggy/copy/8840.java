private static java.lang.String resolveMessageIfNotSet(java.lang.String message, java.lang.Throwable cause) {
    if (message == null) {
        if (cause == null) {
            message = "Unknown";
        }else {
            message = cause.getMessage();
        }
    }
    return message;
}