@java.lang.Override
public void stop(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    com.kalix.framework.core.util.SystemUtil.stopBundlePrintln(bundleContext);
    this.context = null;
}