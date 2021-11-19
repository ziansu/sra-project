@java.lang.Override
protected void createEditPolicies() {
    super.createEditPolicies();
    installEditPolicy("Snap Feedback", new org.eclipse.gef.editpolicies.SnapFeedbackPolicy());
}