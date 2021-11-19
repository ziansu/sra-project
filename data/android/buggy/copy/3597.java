public int remove(org.dbflute.erflute.editor.model.diagram_contents.element.node.note.WalkerNote note) {
    final int index = noteList.indexOf(note);
    if (0 < index) {
        noteList.remove(note);
    }
    firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.note.WalkerNoteSet.PROPERTY_CHANGE_WALKER_NOTE_SET, null, null);
    return index;
}