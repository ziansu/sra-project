@java.lang.Override
public void visit(org.teavm.javascript.TryCatchStatement statement) {
    check(statement.getProtectedBody());
    check(statement.getHandler());
}