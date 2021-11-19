static java.lang.Runnable runnable(org.zanata.util.RunnableEx r) {
    return () -> {
        try {
            r.run();
        } catch (java.lang.Exception e) {
            new java.lang.RuntimeException(e);
        }
    };
}