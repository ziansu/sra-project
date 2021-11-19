@java.lang.Override
public boolean containsAll(java.util.Collection<?> c) {
    return ((c.size()) == 1) && (content.equals(c.iterator().next()));
}