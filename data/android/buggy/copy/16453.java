public void pushUndo(Command cmd) {
    if (isUndo) {
        isUndo = false;
        return ;
    }
    undoStack.push(cmd);
    if (!(isRedo)) {
        redoStack.clear();
    }
}