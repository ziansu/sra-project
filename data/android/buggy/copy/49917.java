public static void assertFails(java.util.concurrent.Callable<?> c) {
    try {
        c.call();
        throw new java.lang.RuntimeException("the call did not fail");
    } catch (java.lang.Exception e) {
    }
}