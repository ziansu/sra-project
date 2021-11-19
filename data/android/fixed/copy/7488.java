protected org.apache.lucene.index.AtomicReader getSecureAtomicReader(org.apache.lucene.index.AtomicReader atomicReader) throws java.io.IOException {
    return lucene.security.index.SecureAtomicReader.create(_accessControlFactory, atomicReader, _readAuthorizations, _discoverAuthorizations, _discoverableFields);
}