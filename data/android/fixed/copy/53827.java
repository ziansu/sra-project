@java.lang.Override
public org.exist.xquery.value.SequenceIterator unorderedIterator() throws org.exist.xquery.XPathException {
    return new org.exist.xquery.RangeSequence.RangeSequenceIterator(start.getLong(), end.getLong());
}