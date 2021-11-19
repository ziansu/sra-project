int getConnectionCount() {
    int count = 0;
    synchronized(bindings) {
        for (com.lody.virtual.server.am.ServiceRecord.IntentBindRecord record : bindings.values()) {
            count += record.connections.size();
        }
    }
    return count;
}