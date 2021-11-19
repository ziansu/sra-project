private void filterByBatchIds(java.util.List<java.lang.String> selectionParts) {
    if (((batchIds) == null) || ((batchIds.length) == 0)) {
        return ;
    }
    selectionParts.add(getWhereClauseForBatchIds(batchIds));
}