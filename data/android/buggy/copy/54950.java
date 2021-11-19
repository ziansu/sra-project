public java.util.ArrayList<java.lang.String> Query(int[] combined) {
    SqlQueryBuilder sqlQuery = new SqlQueryBuilder(combined, connection);
    return sqlQuery.queriedList;
}