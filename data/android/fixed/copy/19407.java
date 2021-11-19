protected void deployDeJureNorms() throws cartago.OperationException {
    assert (deJure) != null;
    cartago.OpFeedbackParam<npl.Scope> scope = new cartago.OpFeedbackParam<npl.Scope>();
    execLinkedOp(deJure, "createNPLScope", scope);
    nengine.loadNP(scope.get());
}