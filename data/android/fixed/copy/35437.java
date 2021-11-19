@java.lang.Override
public byte[] receive() {
    synchronized(this.receiveBuffer) {
        if (this.receiveBuffer.isEmpty()) {
            return null;
        }
        return this.receiveBuffer.poll().getPacketData();
    }
}