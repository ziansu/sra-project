@java.lang.Override
public void receive(sample.complex.ComplexBuffer buffer) {
    synchronized(mBuffer) {
        if ((mBuffer) != null) {
            mBuffer.add(buffer);
        }
    }
}