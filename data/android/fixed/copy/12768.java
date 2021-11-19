public void removeIncoming(org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection relation) {
    incomings.remove(relation);
    firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker.PROPERTY_CHANGE_INCOMING, null, null);
}