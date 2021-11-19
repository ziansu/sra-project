@java.lang.Override
public org.neo4j.driver.v1.StatementResult run(java.lang.String statementTemplate, java.util.Map<java.lang.String, java.lang.Object> statementParameters) {
    final org.neo4j.graphdb.Result internalResult = gds.execute(statementTemplate, statementParameters);
    final neo4j.driver.testkit.data.EmbeddedTestkitStatementResult driverResult = new neo4j.driver.testkit.data.EmbeddedTestkitStatementResult(internalResult);
    return driverResult;
}