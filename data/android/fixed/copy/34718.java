public org.apache.cassandra.service.MessageIn<org.apache.cassandra.service.ReadResponse> readResponseMessage(java.net.InetAddress from, org.apache.cassandra.service.UnfilteredPartitionIterator partitionIterator) {
    return readResponseMessage(from, partitionIterator, command);
}