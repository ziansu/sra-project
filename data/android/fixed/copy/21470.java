@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    try {
        base.evaluate();
    } finally {
        removeAllOrdersFromOrderOverview();
    }
}