public void deleteMarkers() throws org.eclipse.core.runtime.CoreException {
    file.deleteMarkers(IRascalResources.ID_RASCAL_MARKER, true, IFile.DEPTH_ZERO);
}