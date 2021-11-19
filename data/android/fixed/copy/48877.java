private org.apache.hadoop.yarn.event.Dispatcher setupDispatcher() {
    org.apache.hadoop.yarn.event.Dispatcher dispatcher = createDispatcher();
    dispatcher.register(org.apache.hadoop.yarn.server.resourcemanager.RMFatalEventType.class, new org.apache.hadoop.yarn.server.resourcemanager.ResourceManager.RMFatalEventDispatcher());
    return dispatcher;
}