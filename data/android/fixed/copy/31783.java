@java.lang.Override
public boolean hasNext() {
    return (inputIterator.hasNext()) || (((outputIterator) != null) && (outputIterator.hasNext()));
}