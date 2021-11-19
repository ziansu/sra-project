@java.lang.Override
public void close() {
    database.close();
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(insertStatementMap);
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(updateStatementMap);
}