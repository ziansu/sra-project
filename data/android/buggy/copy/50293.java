@java.lang.Override
public void stop(org.osgi.framework.BundleContext context_p) throws java.lang.Exception {
    org.eclipse.emf.diffmerge.EMFDiffMergePlugin.__plugin = null;
    _adapterFactory.dispose();
    super.stop(context_p);
}