@java.lang.Override
public int executeUpdate(java.lang.String sql) throws java.sql.SQLException {
    execute0(sql, null);
    int res = getUpdateCount();
    if (res == (-1))
        throw new java.sql.SQLException(("The query is not DML statememt: " + sql));
    
    return res;
}