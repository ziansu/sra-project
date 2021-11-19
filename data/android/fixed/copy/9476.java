@java.lang.Override
public synchronized void reset() throws java.io.IOException {
    byteBuf[0] = byteBufSave[0];
    byteBuf[1] = byteBufSave[1];
    unusedBytes = unusedBytesSave;
    super.reset();
}