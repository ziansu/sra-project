public void send_getTransportInfo(java.lang.String applyDocCode) throws org.apache.thrift.TException {
    rfid.service.RFIDService.getTransportInfo_args args = new rfid.service.RFIDService.getTransportInfo_args();
    args.setApplyDocCode(applyDocCode);
    sendBase("getTransportInfo", args);
}