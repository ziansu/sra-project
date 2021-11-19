private java.lang.String genExecFunc() {
    if (((context.hasJoin) == false) && (context.realization.getModel().isLookupTable(tableName))) {
        return "executeLookupTableQuery";
    }else {
        return "executeOLAPQuery";
    }
}