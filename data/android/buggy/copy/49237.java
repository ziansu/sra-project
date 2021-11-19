public void pushUndoableAction(actions.edit.undoredo.UndoRedoableInterface undoredoableAction) {
    undoStack.push(undoredoableAction);
    redoStack.clear();
    delegate.didAddNewAction(undoredoableAction);
}