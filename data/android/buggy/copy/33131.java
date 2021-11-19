private void filterByBatchIds(java.util.List<java.lang.String> selectionParts) {
    if ((batchIds) == null) {
        return ;
    }
    selectionParts.add(getWhereClauseForBatchIds(batchIds));
}