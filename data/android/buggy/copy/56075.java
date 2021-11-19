@java.lang.Override
public synchronized org.apache.lucene.store.CompoundFileDirectory createCompoundOutput(java.lang.String name) throws java.io.IOException {
    if (cache.fileExists(name)) {
        throw new java.io.IOException((("File " + name) + "already exists"));
    }else {
        return delegate.createCompoundOutput(name);
    }
}