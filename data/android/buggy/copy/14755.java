private static boolean hasTargetClass(org.eclipse.rdf4j.model.Resource shapeId, org.eclipse.rdf4j.repository.sail.SailRepositoryConnection connection) {
    if (connection.hasStatement(shapeId, SHACL.TARGET_CLASS, null, true))
        return true;
    else
        return false;
    
}