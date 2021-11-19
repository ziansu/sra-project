public static void delete(java.lang.String tableName) {
    for (int i = 0; i < (JSQL.table.get(tableName).size()); i++) {
        JSQL.deleteValues(tableName, i);
    }
}