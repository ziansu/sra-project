@java.lang.Override
protected void createEditPolicies() {
    installEditPolicy(EditPolicy.CONNECTION_ROLE, new org.dbflute.erflute.editor.controller.editpolicy.element.connection.RelationEditPolicy());
}