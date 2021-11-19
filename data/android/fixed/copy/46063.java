private void parseDefineAliasTable(fitnesse.testsystems.slim.Table table) {
    for (int rowIndex = 1; rowIndex < (table.getRowCount()); rowIndex++)
        parseDefineAliasRow(table, rowIndex);
    
}