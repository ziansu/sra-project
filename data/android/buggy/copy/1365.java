protected static boolean shouldTrace(java.lang.String pluginId) {
    if (org.eclipse.ecf.core.util.Trace.TRACEALL)
        return true;
    else
        if (org.eclipse.ecf.core.util.Trace.TRACE_BUNDLES.contains(pluginId))
            return true;
        else
            return org.eclipse.ecf.core.util.Trace.shouldTrace0((pluginId + "/debug"));
        
    
}