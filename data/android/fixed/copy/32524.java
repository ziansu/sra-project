public void queueMessage(com.algaroth.core.net.packet.Packet arg1) {
    synchronized(queuedPackets) {
        queuedPackets.add(arg1);
    }
}