public org.apache.lucene.index.Term createTerm(java.lang.Object value) {
    return new org.apache.lucene.index.Term(name(), indexedValueForSearch(value));
}