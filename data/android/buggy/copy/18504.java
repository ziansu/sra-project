@java.lang.Override
public void updateProjectionObliqueValues() {
    if ((type) == (RendererType.GL2)) {
        updateOrthoValues();
    }
    super.updateProjectionObliqueValues();
}