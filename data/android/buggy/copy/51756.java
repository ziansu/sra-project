@java.lang.Override
public void editInactiveEventPublisherConfiguration(java.lang.String eventPublisherConfiguration, java.lang.String filename) throws org.wso2.carbon.event.publisher.core.exception.EventPublisherConfigurationException {
    validateFilePath(filename);
    editEventPublisherConfiguration(filename, eventPublisherConfiguration, null);
}