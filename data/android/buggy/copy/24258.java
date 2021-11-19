public void pushToTextEditor() {
    if (editMode) {
        notifyListeners(edu.ncsu.csc.Galant.GraphDispatch.TEXT_UPDATE, null, null);
    }
}