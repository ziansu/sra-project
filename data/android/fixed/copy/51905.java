@java.lang.Override
public void undo() throws javax.swing.undo.CannotUndoException {
    super.undo();
    not.setCondition(null);
    condition = null;
    conditionContainer.removeAll();
    refresh();
    checkValid();
}