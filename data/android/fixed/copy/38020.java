private org.neo4j.graphdb.Result getResult(java.lang.String query, org.neo4j.shell.Session session) throws java.rmi.RemoteException, org.neo4j.kernel.impl.query.QueryExecutionKernelException, org.neo4j.shell.ShellException {
    return getEngine().executeQuery(query, getParameters(session), shellSession(session));
}