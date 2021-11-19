@java.lang.Override
public boolean deleteStreamById(java.lang.String sessionId, java.lang.String streamId) throws org.apache.thrift.TException, org.wso2.carbon.databridge.commons.thrift.exception.ThriftSessionExpiredException {
    try {
        return dataBridgeReceiverService.deleteStream(sessionId, sessionId);
    } catch (org.wso2.carbon.databridge.commons.exception.SessionTimeoutException e) {
        throw new org.wso2.carbon.databridge.commons.thrift.exception.ThriftSessionExpiredException(e.getErrorMessage());
    }
}