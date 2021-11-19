public org.apache.lucene.util.BytesRef getValue() {
    int numValues = values.count();
    if (numValues == 0) {
        return new org.apache.lucene.util.BytesRef();
    }
    return values.valueAt(0);
}