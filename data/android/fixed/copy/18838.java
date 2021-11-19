public void removeNonModifiableColumn(java.lang.Integer... columnIndexes) {
    for (java.lang.Integer column : columnIndexes) {
        this.nonModifiableColumns.remove(column);
    }
}