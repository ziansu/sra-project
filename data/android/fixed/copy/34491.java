public static void createTable(net.sqlcipher.database.SQLiteDatabase database) {
    database.execSQL(org.smartregister.immunization.repository.VaccineNameRepository.VACCINE_Names_SQL);
}