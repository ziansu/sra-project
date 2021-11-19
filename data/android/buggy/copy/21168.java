private java.lang.String getExpressionForOperation(org.eclipse.sirius.viewpoint.description.tool.InitialOperation initialOperation) {
    return ("aql:self.executeOperation('" + (org.eclipse.emf.ecore.util.EcoreUtil.getURI(initialOperation).toString())) + "')";
}