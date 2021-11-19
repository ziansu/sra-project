@java.lang.Override
public void close() throws javax.ws.rs.ProcessingException {
    try {
        context.close();
    } finally {
        if ((scopeInstance) != null) {
            scopeInstance.release();
        }
    }
}