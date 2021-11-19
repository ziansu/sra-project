@java.lang.Override
public java.util.Optional<java.lang.String> getUnboundSQLStatement() {
    return sql.contains("?") ? java.util.Optional.ofNullable(sql) : java.util.Optional.empty();
}