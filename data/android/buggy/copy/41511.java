protected void removeEventSubscriber(org.eclipse.smarthome.core.events.EventSubscriber eventSubscriber) {
    java.util.Set<java.lang.String> subscribedEventTypes = eventSubscriber.getSubscribedEventTypes();
    for (java.lang.String subscribedEventType : subscribedEventTypes) {
        typedEventSubscribers.remove(subscribedEventType, eventSubscriber);
    }
}