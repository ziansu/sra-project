@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    try {
        statement.evaluate();
    } finally {
        if ((testNotifier) != null) {
            testNotifier.fireAfterClass();
        }
    }
}