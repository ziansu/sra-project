private void bind() {
    if ((selectedElement) != null) {
        setData(selectedElement);
    }
    if ((selectedExtension) != null) {
        selectedExtension.updateTypeBindingsWithModules();
    }
    elementTreeModel.nodeStructureChanged(elementTreeOrigin);
}