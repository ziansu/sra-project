@org.junit.Test
public void test() {
    final java.lang.String statement = com.askit.queries.SQLFactory.buildStatementForAreaSelect(Constants.SCHEMA_NAME, Constants.TABLE_PUBLIC_QUESTIONS, "createDate DESC", "createDate ASC", 100, 10);
}