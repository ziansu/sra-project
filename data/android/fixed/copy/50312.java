@java.lang.Override
public boolean hasNext() {
    if ((object) == null) {
        object = fetchNextUsingRowBound();
    }
    return (object) != null;
}