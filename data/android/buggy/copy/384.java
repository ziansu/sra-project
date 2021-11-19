@java.lang.Override
public org.apache.ibatis.mapping.BoundSql getBoundSql(java.lang.Object parameterObject) {
    if ((this.boundSql) == null) {
        this.boundSql = newBoundSql(config, origMs, parameterObject);
    }
    return this.boundSql;
}