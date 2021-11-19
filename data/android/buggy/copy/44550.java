@java.lang.Override
public java.lang.String getInactiveEventReceiverConfigurationContent(java.lang.String fileName) throws org.wso2.carbon.event.receiver.core.exception.EventReceiverConfigurationException {
    validateFilePath(fileName);
    return org.wso2.carbon.event.receiver.core.internal.util.helper.EventReceiverConfigurationFileSystemInvoker.readEventReceiverConfigurationFile(fileName);
}