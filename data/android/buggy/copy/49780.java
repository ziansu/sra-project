public synchronized void returnConnection(com.google.cloud.bigtable.dataflow.CloudBigtableConnectionPool.PoolEntry entry) {
    if (entry.isExpired()) {
        closeAsynchronously(entry);
    }else {
        connections.put(entry.getKey(), entry);
    }
}