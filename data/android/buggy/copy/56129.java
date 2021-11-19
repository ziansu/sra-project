@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    try {
        statement.evaluate();
    } finally {
        testNotifier.fireAfterClass();
    }
}