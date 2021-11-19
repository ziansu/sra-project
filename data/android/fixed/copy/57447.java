public prototype.Record getRecord(int index) throws prototype.DatabaseException {
    return new prototype.Record(storage.getRow(index), schema);
}