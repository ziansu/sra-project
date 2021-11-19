public java.lang.String checkOnline(long userId) throws org.apache.thrift.TException {
    send_checkOnline(userId);
    return recv_checkOnline();
}