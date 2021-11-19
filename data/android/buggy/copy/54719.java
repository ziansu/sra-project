@java.lang.Override
public void addFirst(T t) {
    ensureHasCpacity(1);
    buffer.addFirst(t);
}