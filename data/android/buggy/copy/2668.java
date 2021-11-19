@java.lang.Override
public boolean hasNext() {
    return ((consumed) < (limit)) && (iterator.hasNext());
}