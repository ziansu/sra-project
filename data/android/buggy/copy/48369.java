public static java.lang.RuntimeException rethrow(java.lang.Throwable t) {
    if (t instanceof java.lang.RuntimeException) {
        throw ((java.lang.RuntimeException) (t));
    }else {
        throw new java.lang.RuntimeException(t);
    }
}