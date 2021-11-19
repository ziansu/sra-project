public java.util.ArrayList<java.lang.String> Query(int[] combined) {
    SqlQueryBuilder sqlQuery = new SqlQueryBuilder(combined, connection);
    for (int i = 0; i < (sqlQuery.queriedList.size()); ++i) {
    }
    return sqlQuery.queriedList;
}