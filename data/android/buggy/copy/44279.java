public void stop(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    com.samsung.sec.dexter.core.config.DexterConfig.getInstance().removeDexterHomeListener(this);
    com.samsung.sec.dexter.eclipse.ui.DexterUIActivator.plugin = null;
    com.samsung.sec.dexter.core.config.DexterConfig.getInstance().stopSchedule();
    super.stop(context);
}