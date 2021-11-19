@java.lang.Override
public void undeployInactiveEventReceiverConfiguration(java.lang.String filename) throws org.wso2.carbon.event.receiver.core.exception.EventReceiverConfigurationException {
    org.wso2.carbon.event.receiver.core.internal.util.helper.EventReceiverConfigurationFileSystemInvoker.delete(filename);
}