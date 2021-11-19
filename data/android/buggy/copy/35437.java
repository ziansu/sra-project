@java.lang.Override
public byte[] receive() {
    synchronized(this.receiveBuffer) {
        return this.receiveBuffer.poll().getPacketData();
    }
}