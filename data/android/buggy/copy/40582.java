public lk.filetributed.client.rpc.services.messageProtocol mergeFileTable(java.lang.String ipAddress, int port, int clusterID, java.lang.String fileTableEntries) throws org.apache.thrift.TException {
    send_mergeFileTable(ipAddress, port, clusterID, fileTableEntries);
    return recv_mergeFileTable();
}