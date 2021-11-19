public void sendMessage(bus.Message m) {
    for (bus.IMessageListener listener : registeredListeners) {
        listener.receiveMessage(m);
    }
}