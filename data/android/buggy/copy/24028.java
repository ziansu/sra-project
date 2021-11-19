@java.lang.Override
public com.linkedin.pinot.core.operator.docidsets.FilterBlockDocIdSet getFilteredBlockDocIdSet() {
    return new com.linkedin.pinot.core.operator.docidsets.SizeBasedDocIdSet(_totalDocs);
}