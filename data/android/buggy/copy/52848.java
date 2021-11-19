@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    org.openhab.binding.megadevice.internal.MegaDeviceActivator.logger.debug("MegaDevice binding has been started.");
    new org.openhab.binding.megadevice.internal.MegadeviceHttpServer().start();
}