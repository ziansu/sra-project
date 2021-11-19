public boolean visit(com.alibaba.druid.sql.visitor.SQLCreateTableStatement x) {
    printCreateTable(x, true);
    return false;
}