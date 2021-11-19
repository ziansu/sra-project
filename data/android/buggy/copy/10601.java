@java.lang.Override
protected org.neo4j.kernel.impl.query.QueryExecutionEngine createEngine(org.neo4j.kernel.GraphDatabaseAPI graphAPI) {
    org.neo4j.kernel.logging.Logging logging = graphAPI.getDependencyResolver().resolveDependency(org.neo4j.kernel.logging.Logging.class);
    org.neo4j.cypher.internal.compiler.v2_2.spi.Logger logger = new org.neo4j.cypher.internal.spi.v2_2.DefaultLogger(logging.getMessagesLog(org.neo4j.kernel.impl.query.QueryExecutionEngine.class));
    return new org.neo4j.cypher.javacompat.internal.ServerExecutionEngine(graphAPI, logger);
}