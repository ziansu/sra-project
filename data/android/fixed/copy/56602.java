int getConnectionCount() {
    int count = 0;
    synchronized(bindings) {
        for (com.lody.virtual.server.am.ServiceRecord.IntentBindRecord record : bindings) {
            count += record.connections.size();
        }
    }
    return count;
}