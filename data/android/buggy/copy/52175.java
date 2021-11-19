private static io.hops.transaction.EntityManager.Context context() {
    io.hops.transaction.EntityManager.Context ctx = io.hops.transaction.EntityManager.context.get();
    if ((io.hops.transaction.EntityManager.context) == null) {
        throw new java.lang.RuntimeException("context was not initialized");
    }
    return ctx;
}