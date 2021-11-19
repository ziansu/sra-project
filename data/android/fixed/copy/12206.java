public static void createTable(net.sqlcipher.database.SQLiteDatabase database) {
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceTypeRepository.CREATE_TABLE_SQL);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceTypeRepository.TYPE_INDEX);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceTypeRepository.NAME_INDEX);
    database.execSQL(org.smartregister.immunization.repository.RecurringServiceTypeRepository.UPDATED_AT_INDEX);
}