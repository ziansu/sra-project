@java.lang.Override
public void dispose() {
    problemManager.restoreState();
    org.eclipse.core.resources.ResourcesPlugin.getWorkspace().removeResourceChangeListener(editorAutoCloser);
    super.dispose();
}