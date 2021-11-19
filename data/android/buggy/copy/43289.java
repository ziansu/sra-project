public void receive(org.apache.axis2.context.MessageContext msgContext) throws org.apache.axis2.AxisFault {
    synchronized(concurrencyReachedLock) {
        (concurrencyReached)++;
        concurrencyReachedLock.notifyAll();
    }
    try {
        shutdownAwaitLock.wait();
    } catch (java.lang.InterruptedException ex) {
    }
}