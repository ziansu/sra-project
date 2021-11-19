protected synchronized void notifyUDPReceived(at.htl.smartrobot.server.utils.UDPReceiveEvent e) {
    for (at.htl.smartrobot.server.utils.UDPReceiveListener l : listeners) {
        l.onReceive(e);
    }
}