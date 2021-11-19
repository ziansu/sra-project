public void deleteConnections() {
    for (advancedsystemsmanager.flow.Connection connection : connections) {
        if (connection != null)
            connection.deleteConnection(manager);
        
    }
}