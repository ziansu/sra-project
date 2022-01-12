@java.lang.Override
public final void close() {
    try {
        closeInternal();
    } catch (java.lang.Exception ex) {
        org.jeo.sql.Backend.LOG.warn("Error closing Results", ex);
    }
    closeSafe(session);
}