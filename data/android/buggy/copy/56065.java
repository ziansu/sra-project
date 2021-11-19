public void dropTable(com.codename1.properties.PropertyBusinessObject cmp) throws java.io.IOException {
    java.lang.String tableName = getTableName(cmp);
    db.execute(("Drop table " + tableName));
}