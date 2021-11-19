public java.lang.String getAggregateFieldName() {
    java.lang.String fieldname = tree.getAggregate().getFieldname();
    com.tcdi.zombodb.query_parser.IndexMetadata md = metadataManager.getMetadataForField(fieldname);
    return maybeStripFieldname(fieldname, md);
}