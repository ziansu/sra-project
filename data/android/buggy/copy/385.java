private void processBundleStop(org.apache.unomi.services.services.BundleContext bundleContext) {
    if (bundleContext == null) {
        return ;
    }
    actionExecutorDispatcher.removeExecutors(bundleContext.getBundle().getBundleId());
}