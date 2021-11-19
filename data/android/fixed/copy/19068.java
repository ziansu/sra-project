public void throwError(java.lang.String s, java.lang.Object... params) {
    java.lang.String message = (s == null) ? "" : (MQ7PREFIX) + (java.lang.String.format(s, params));
    throw new java.lang.RuntimeException(message);
}