@java.lang.Override
public java.lang.String checkOnline(java.lang.String userId) throws org.apache.thrift.TException {
    return onlineStatusServer.query(userId);
}