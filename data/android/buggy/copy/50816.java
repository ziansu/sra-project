public void deleteConnections(advancedsystemsmanager.tileentities.manager.TileEntityManager manager) {
    for (advancedsystemsmanager.flow.Connection connection : connections) {
        if (connection != null) {
            connection.deleteConnection(manager);
        }
    }
}