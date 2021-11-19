@java.lang.Override
public NativeQuery.ReturnProperty addColumnAlias(java.lang.String columnAlias) {
    if ((columnAliases) == null) {
        columnAliases = new java.util.ArrayList<>();
    }
    columnAliases.add(columnAlias);
}