public prototype.Record getRecord() throws prototype.DatabaseException {
    return new prototype.Record(storage.getRow(), schema);
}