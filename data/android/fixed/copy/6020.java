@java.lang.Override
public void run() {
    if ((request) != null)
        com.linkedin.pinot.core.trace.TraceContext.registerThreadToRequest(request, parent);
    
    try {
        runJob();
    } finally {
        if ((request) != null)
            com.linkedin.pinot.core.trace.TraceContext.unregisterThreadFromRequest();
        
    }
}