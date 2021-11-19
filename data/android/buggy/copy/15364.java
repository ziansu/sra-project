public net.sf.jsqlparser.statement.Statement testFullURISingle(java.lang.String sqlcmd) throws java.lang.Exception {
    net.sf.jsqlparser.statement.Statement statement = io.ddf.spark.TableNameReplacerTests.parser.parse(new java.io.StringReader(sqlcmd));
    io.ddf.TableNameReplacer tableNameReplacer = new io.ddf.TableNameReplacer(io.ddf.spark.TableNameReplacerTests.manager);
    return null;
}