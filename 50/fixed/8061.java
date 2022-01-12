public void registerSave() {
    if (!(undoStack.isEmpty()))
        savedAtAction = undoStack.peek();
    else
        savedAtAction = null;
    
}