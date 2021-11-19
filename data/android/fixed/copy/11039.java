public long addEntities(net.sf.jailer.datamodel.Table table, java.lang.String condition, int today) throws java.sql.SQLException {
    checkPseudoColumns(table, condition);
    return addEntities(table, "T", condition, today);
}