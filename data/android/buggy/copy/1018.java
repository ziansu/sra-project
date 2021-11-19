private void clearInternal() {
    for (final com.notlob.jgrid.model.Column column : sortedColumns) {
        column.setSortSequence(0);
        column.setSortDirection(SortDirection.NONE);
    }
    sortedColumns.clear();
}