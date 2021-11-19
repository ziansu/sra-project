private org.springframework.data.neo4j.support.Neo4jTemplate neo4jTemplate(com.lordofthejars.nosqlunit.neo4j.Neo4jConnectionCallback connection) {
    org.neo4j.graphdb.GraphDatabaseService graphDatabaseService = connection.graphDatabaseService();
    org.springframework.data.neo4j.support.Neo4jTemplate neo4jTemplate = new org.springframework.data.neo4j.support.Neo4jTemplate(graphDatabaseService);
    return neo4jTemplate;
}