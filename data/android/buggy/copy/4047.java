void unregister(java.lang.Object objectToUnregister) {
    com.kk.bus.EventDeliverer registeredEventObjectContext;
    synchronized(this) {
        registeredEventObjectContext = mObjectDeliverers.remove(objectToUnregister);
    }
    if (registeredEventObjectContext != null) {
        registeredEventObjectContext.clearOut();
    }
}