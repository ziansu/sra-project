@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    final java.lang.String DEBUG_MESSAGE = "Initializing the aaa-shiro-act bundle";
    org.opendaylight.aaa.shiroact.Activator.LOG.debug(DEBUG_MESSAGE);
    org.opendaylight.aaa.shiro.ServiceProxy.getInstance().setEnabled(true);
}