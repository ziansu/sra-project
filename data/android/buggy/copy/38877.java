public lk.filetributed.client.rpc.services.services.joinRequest_result getResult(I iface, lk.filetributed.client.rpc.services.services.joinRequest_args args) throws org.apache.thrift.TException {
    lk.filetributed.client.rpc.services.services.joinRequest_result result = new lk.filetributed.client.rpc.services.services.joinRequest_result();
    result.success = iface.joinRequest(args.ipAddress, args.port, args.clusterID);
    return result;
}