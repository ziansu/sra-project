public void dropIndexes(final java.lang.String targetId) throws java.sql.SQLException {
    new de.akquinet.jbosscc.guttenbase.tools.ScriptExecutorTool(_connectorRepository).executeScript(targetId, true, true, createDropIndexesStatements(targetId));
}