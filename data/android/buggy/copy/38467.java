@java.lang.Override
public synchronized org.apache.lucene.store.CompoundFileDirectory openCompoundInput(java.lang.String name, int bufferSize) throws java.io.IOException {
    if (cache.fileExists(name)) {
        return cache.openCompoundInput(name, bufferSize);
    }else {
        return delegate.openCompoundInput(name, bufferSize);
    }
}