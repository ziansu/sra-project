public void drop() throws java.sql.SQLException {
    java.lang.String statement = worm.abstractation.QueryGenerator.drop(from, where);
    database.sqlWithoutResult(statement, args.toArray());
}