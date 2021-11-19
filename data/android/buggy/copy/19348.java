private void redo() {
    if (!(redoStack.isEmpty())) {
        showImage(redoStack.pop(), true);
    }
}