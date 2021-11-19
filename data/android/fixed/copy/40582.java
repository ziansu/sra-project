public lk.filetributed.client.rpc.services.messageProtocol mergeFileTable(java.lang.String ipAddress, int port, java.lang.String fileTableEntries) throws org.apache.thrift.TException {
    send_mergeFileTable(ipAddress, port, fileTableEntries);
    return recv_mergeFileTable();
}