private static void init() {
    xdb.TimeSeriesDB2.checkDir(xdb.TimeSeriesDB2.db);
    xdb.TimeSeriesDB2.conn = wiredtiger.open(xdb.TimeSeriesDB2.db, "create");
}