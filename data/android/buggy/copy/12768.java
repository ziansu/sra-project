public void removeIncoming(org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection relation) {
    this.incomings.remove(relation);
    this.firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker.PROPERTY_CHANGE_INCOMING, null, null);
}