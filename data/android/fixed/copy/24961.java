private java.lang.String genExecFunc() {
    if (context.realization.getModel().isLookupTable(tableName)) {
        return "executeLookupTableQuery";
    }else {
        return "executeOLAPQuery";
    }
}