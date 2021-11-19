@java.lang.Override
public boolean isEmpty() {
    assert java.lang.Thread.holdsLock(this);
    synchronized(this) {
        return (wire.bytes().writePosition()) == 0;
    }
}