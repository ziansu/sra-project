@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    tern.metadata.TernModuleMetadataManager.getInstance().init(tern.eclipse.ide.core.TernCorePlugin.getTernCoreBaseDir());
}