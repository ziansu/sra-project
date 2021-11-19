public boolean hasRequiredCardinality(final org.exquery.xquery.Cardinality requiredCardinality) {
    return ((requiredCardinality.value) & (value)) == (value);
}