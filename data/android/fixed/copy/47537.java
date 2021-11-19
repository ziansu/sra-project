@java.lang.Override
public void stop(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    itemManager.persistItems();
    if ((httpServiceRef) != null) {
        bundleContext.ungetService(httpServiceRef);
    }
    registration.unregister();
}