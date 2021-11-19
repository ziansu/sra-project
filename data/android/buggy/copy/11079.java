private static org.apache.lucene.index.PostingsEnum termDocs(org.apache.lucene.index.IndexReader reader, org.apache.lucene.index.Term term) throws java.io.IOException {
    return org.apache.lucene.index.MultiFields.getTermDocsEnum(reader, org.apache.lucene.index.MultiFields.getLiveDocs(reader), term.field(), term.bytes());
}