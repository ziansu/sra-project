@java.lang.Override
public boolean remove(java.lang.Object o) {
    final boolean result = getSubList().remove(o);
    adjustSize((-1));
    return result;
}