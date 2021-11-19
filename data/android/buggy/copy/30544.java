public java.util.List<de.pepe4u.space.dto.CommunicationPartner> getReceivedStateChanges() {
    java.util.List<de.pepe4u.space.dto.CommunicationPartner> lRet = new java.util.ArrayList<>();
    synchronized(lockReceivedStateChanges) {
        lRet.addAll(receivedStateChanges);
        receivedStateChanges.clear();
    }
    return receivedStateChanges;
}