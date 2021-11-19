public static java.util.List<model.Record> getRecordsByBirthday(java.io.File file) {
    java.util.List<model.Record> records = util.RecordUtil.parseRecords(file);
    util.RecordUtil.sortRecordsByBirthDay(records);
    return records;
}