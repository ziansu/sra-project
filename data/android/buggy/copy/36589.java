public database.data.DataRecord getLastRecord() {
    database.data.DataRecord record = database.ReadInDatabase.getLastIndicator(this);
    record.setType("indicator");
    record.setName(this.getType());
    return record;
}