@java.lang.Override
public com.github.luischavez.database.link.Affecting delete(java.lang.String sql, com.github.luischavez.database.grammar.Bindings bindings) {
    return this.execute(sql, bindings, null, false);
}