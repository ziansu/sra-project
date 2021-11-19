private void deleteSensorFromDB(com.example.ludvig.sens.SensorDBItem sensor, android.database.sqlite.SQLiteDatabase db) {
    nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(db).delete(sensor);
}