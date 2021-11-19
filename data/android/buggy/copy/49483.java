@org.testng.annotations.BeforeMethod(groups = "short", alwaysRun = true)
public void setup() throws java.lang.Exception {
    resetTestSession();
    execute("CREATE TABLE prepared_statement_invalidation_test (a int PRIMARY KEY, b int, c int);");
    execute("INSERT INTO prepared_statement_invalidation_test (a, b, c) VALUES (1, 1, 1);");
    execute("INSERT INTO prepared_statement_invalidation_test (a, b, c) VALUES (2, 2, 2);");
    execute("INSERT INTO prepared_statement_invalidation_test (a, b, c) VALUES (3, 3, 3);");
    execute("INSERT INTO prepared_statement_invalidation_test (a, b, c) VALUES (4, 4, 4);");
}