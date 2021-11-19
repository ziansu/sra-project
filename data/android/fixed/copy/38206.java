@java.lang.Override
public void receive(distributed.schiperegglisandoz.Message m) {
    synchronized(messageBuffer) {
        messageBuffer.add(m);
        checkDeliveries();
    }
}