@org.osgi.service.component.annotations.Activate
protected void start(org.osgi.framework.BundleContext bundleContext) {
    this.bundleContext = bundleContext;
    this.readers = new java.util.HashMap<>();
}