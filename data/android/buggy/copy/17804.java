public void renewRelationList() {
    final java.util.List<org.dbflute.erflute.editor.model.diagram_contents.element.connection.Relationship> newRelationList = new java.util.ArrayList<>();
    newRelationList.addAll(this.relationshipList);
    this.relationshipList = newRelationList;
}