@java.lang.Override
public java.util.Iterator<T> iterator() {
    return com.arangodb.util.CollectionUtils.safetyIterator(results);
}