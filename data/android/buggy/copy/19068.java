public void throwError(java.lang.String s, java.lang.Object... params) {
    java.lang.String message = (s == null) ? "" : (MQ7PREFIX) + (java.text.MessageFormat.format(s, params));
    throw new java.lang.RuntimeException(message);
}