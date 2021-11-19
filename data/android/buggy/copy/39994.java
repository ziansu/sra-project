@java.lang.Override
public void setBrokerService(org.apache.activemq.broker.BrokerService brokerService) {
    this.brokerService = brokerService;
    for (org.apache.activemq.store.PersistenceAdapter persistenceAdapter : adapters) {
        if (persistenceAdapter instanceof org.apache.activemq.broker.BrokerServiceAware) {
            ((org.apache.activemq.broker.BrokerServiceAware) (persistenceAdapter)).setBrokerService(getBrokerService());
        }
    }
}