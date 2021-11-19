public static void main(java.lang.String[] args) {
    com.stratio.connector.cassandra.CassandraConnector cassandraConnector;
    cassandraConnector = new com.stratio.connector.cassandra.CassandraConnector();
    com.stratio.crossdata.connectors.ConnectorApp connectorApp = new com.stratio.crossdata.connectors.ConnectorApp();
    connectorApp.startup(cassandraConnector);
    cassandraConnector.attachShutDownHook();
}