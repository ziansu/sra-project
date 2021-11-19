@java.lang.Override
public boolean add(T t) {
    ensureHasCpacity(1);
    return buffer.add(t);
}