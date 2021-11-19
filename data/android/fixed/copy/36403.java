public static void removeStudent(int tableIndex, int studentIndex) {
    data.Table table = data.Table.TABLE_LIST.get(tableIndex);
    table.removeStudent(studentIndex);
    data.Table.TABLE_LIST.remove(tableIndex);
    data.Table.TABLE_LIST.insert(tableIndex, table);
}