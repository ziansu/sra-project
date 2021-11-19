@java.lang.SuppressWarnings(value = "deprecation")
public void postCompile(org.eclipse.core.resources.IResourceDelta delta, org.eclipse.core.resources.IFile buildFile) {
    try {
        buildFile.setDerived(true);
    } catch (org.eclipse.core.runtime.CoreException e) {
        de.ovgu.featureide.core.CorePlugin.getDefault().logError(e);
    }
}