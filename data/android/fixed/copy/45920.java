public void send_checkOnline(java.lang.String userId) throws org.apache.thrift.TException {
    cn.edu.sjtu.se.dclab.oss.thrift.OnlineStatusQueryService.checkOnline_args args = new cn.edu.sjtu.se.dclab.oss.thrift.OnlineStatusQueryService.checkOnline_args();
    args.setUserId(userId);
    sendBase("checkOnline", args);
}