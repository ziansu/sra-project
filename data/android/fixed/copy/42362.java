public void debug(java.lang.String message, java.lang.Throwable throwable, java.lang.Object... arguments) {
    if (android.util.Log.isLoggable(tag, Log.DEBUG)) {
        android.util.Log.d(tag, java.text.MessageFormat.format(message, arguments), throwable);
    }
}