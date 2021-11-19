@java.lang.Override
public void run() {
    try (brave.propagation.CurrentTraceContext.Scope scope = newScope(invocationContext)) {
        task.run();
    }
}