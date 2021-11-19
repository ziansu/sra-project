@java.lang.Override
public void transfer(hs_mannheim.gestureframework.model.Packet packet) {
    if (isConnected()) {
        mConnectionThread.write(packet);
    }
}