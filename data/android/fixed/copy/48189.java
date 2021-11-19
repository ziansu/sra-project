public void deleteDatabase() throws java.io.IOException {
    db_.dropTable(data.PERSTDatabase.DatabaseElement.class);
}