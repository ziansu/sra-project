@java.lang.Override
public boolean isFull() {
    synchronized(this) {
        return full;
    }
}