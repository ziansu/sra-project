public static org.wso2.carbon.transport.jms.clientfactory.JMSConnectionFactoryManager getInstance() {
    synchronized(org.wso2.carbon.transport.jms.clientfactory.JMSConnectionFactoryManager.mutex) {
        if ((org.wso2.carbon.transport.jms.clientfactory.JMSConnectionFactoryManager.jmsConnectionFactoryManager) == null) {
            org.wso2.carbon.transport.jms.clientfactory.JMSConnectionFactoryManager.jmsConnectionFactoryManager = new org.wso2.carbon.transport.jms.clientfactory.JMSConnectionFactoryManager();
        }
    }
    return org.wso2.carbon.transport.jms.clientfactory.JMSConnectionFactoryManager.jmsConnectionFactoryManager;
}