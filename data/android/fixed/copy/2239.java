@java.lang.Override
public void set(T value) {
    synchronized(accessor) {
        accessor.write(value);
        super.set(value);
    }
}