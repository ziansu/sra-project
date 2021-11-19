public final org.osgi.framework.BundleContext getBundleContext() {
    if ((context) == null) {
        throw new java.lang.RuntimeException("Bundle was not activated, yet.");
    }
    return context;
}