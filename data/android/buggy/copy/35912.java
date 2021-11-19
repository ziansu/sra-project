@java.lang.Override
public java.util.Optional<java.lang.String> getUnboundSQLStatement() {
    return (sql.contains("?")) == true ? java.util.Optional.ofNullable(sql) : java.util.Optional.empty();
}