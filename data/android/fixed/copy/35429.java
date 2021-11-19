@java.lang.Override
public void dispose() {
    if ((problemManager) != null) {
        problemManager.restoreState();
    }
    org.eclipse.core.resources.ResourcesPlugin.getWorkspace().removeResourceChangeListener(editorAutoCloser);
    super.dispose();
}