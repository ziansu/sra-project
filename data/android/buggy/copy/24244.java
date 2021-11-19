public void selectTable() {
    java.lang.String tableName = getTableName();
    getSelectedTab().setResource(new spaska.gui.DataInputResource(tableName, this.jdbcConnectionString));
    getSelectedTab().propertyChange(Utils.CHOOSE_TABLE, tableName);
}