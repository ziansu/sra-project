@java.lang.Override
public boolean containsAll(java.util.Collection<?> c) {
    if ((c.size()) != 1) {
        return false;
    }
    return content.equals(c.iterator().next());
}