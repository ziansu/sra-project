public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    registerProductServers();
    super.start(context);
    org.wso2.developerstudio.eclipse.dashboard.Activator.plugin = this;
}