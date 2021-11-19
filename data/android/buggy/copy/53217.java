public lk.filetributed.client.rpc.services.services.mergeFileTable_result getResult(I iface, lk.filetributed.client.rpc.services.services.mergeFileTable_args args) throws org.apache.thrift.TException {
    lk.filetributed.client.rpc.services.services.mergeFileTable_result result = new lk.filetributed.client.rpc.services.services.mergeFileTable_result();
    result.success = iface.mergeFileTable(args.ipAddress, args.port, args.clusterID, args.fileTableEntries);
    return result;
}