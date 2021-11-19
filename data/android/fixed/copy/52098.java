public void addOutgoing(org.dbflute.erflute.editor.model.diagram_contents.element.connection.WalkerConnection relation) {
    outgoings.add(relation);
    firePropertyChange(org.dbflute.erflute.editor.model.diagram_contents.element.node.DiagramWalker.PROPERTY_CHANGE_OUTGOING, null, null);
}