public void insertOrReplaceAbsenceRecord(com.unique.countsystem.Record record, com.unique.countsystem.Student student) {
    mRecordDao.insertOrReplace(record);
    student.getAbsenceRecords().add(record);
}