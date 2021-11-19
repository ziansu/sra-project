private synchronized void notifyListeners(org.openhab.binding.upb.internal.UPBMessage message) {
    for (org.openhab.binding.upb.internal.UPBReader.Listener l : listeners) {
        l.messageReceived(message);
    }
}