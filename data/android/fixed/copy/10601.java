@java.lang.Override
protected org.neo4j.kernel.impl.query.QueryExecutionEngine createEngine(org.neo4j.kernel.GraphDatabaseAPI graphAPI) {
    org.neo4j.kernel.logging.Logging logging = graphAPI.getDependencyResolver().resolveDependency(org.neo4j.kernel.logging.Logging.class);
    return new org.neo4j.cypher.javacompat.internal.ServerExecutionEngine(graphAPI, logging.getMessagesLog(org.neo4j.kernel.impl.query.QueryExecutionEngine.class));
}