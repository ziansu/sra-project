public boolean flush() {
    try {
        flushInternal(_pendingEvents, _currentObjectOutputStream);
        return true;
    } catch (java.io.IOException e) {
        org.jactr.tools.tracer.sinks.trace.internal.TraceFileManager.LOGGER.error("failed to flush ", e);
        cleanup();
        return false;
    }
}