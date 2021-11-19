private void closeConnections() {
    for (io.datakernel.rpc.server.RpcServerConnection connection : connections.values()) {
        connection.close();
    }
}