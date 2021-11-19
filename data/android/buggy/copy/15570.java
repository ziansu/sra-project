public org.apache.lucene.util.BytesRef getBytesValue() {
    if ((values.count()) > 0) {
        return values.valueAt(0);
    }else {
        return null;
    }
}