public boolean hasNext() throws simpledb.DbException, simpledb.TransactionAbortedException {
    return (this.it) == null ? false : it.hasNext();
}