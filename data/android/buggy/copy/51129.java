public static org.doube.util.ResultInserter getInstance() {
    org.doube.util.ResultInserter.rt = ij.measure.ResultsTable.getResultsTable();
    final java.lang.String table = "Results";
    org.doube.util.ResultInserter.rt.show(table);
    return org.doube.util.ResultInserter.INSTANCE;
}