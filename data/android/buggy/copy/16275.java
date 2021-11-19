public java.lang.Runnable wrap(java.lang.Runnable task) {
    final brave.propagation.TraceContext invocationContext = get();
    return () -> {
        try (brave.propagation.CurrentTraceContext.Scope scope = newScope(invocationContext)) {
            task.run();
        }
    };
}