private void devInitComponents() {
    clearDatabaseList();
    clearTableList();
    clearTableData();
    dbadmintool.Login.main(connection, this);
    listDatabases.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    listTables.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
}