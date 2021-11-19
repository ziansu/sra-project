@java.lang.Override
public void set(T value) {
    synchronized(accessor) {
        super.set(value);
        accessor.write(value);
    }
}