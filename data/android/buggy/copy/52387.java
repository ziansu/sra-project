@java.lang.Override
public org.elasticsearch.index.fielddata.SortedBinaryDocValues bytesValues(org.apache.lucene.index.LeafReaderContext context) throws java.io.IOException {
    return org.elasticsearch.search.aggregations.support.org.elasticsearch.index.fielddata.FieldData.emptySortedBinary(context.reader().maxDoc());
}