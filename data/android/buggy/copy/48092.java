public static void Disconnect(java.sql.ResultSet results) {
    NickSifniotis.DatabaseManager.DBManager.closeQuietly(results);
}