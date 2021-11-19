@java.lang.Override
public void visit(org.teavm.javascript.TryCatchStatement statement) {
    if (!(check(statement.getProtectedBody()))) {
        check(statement.getHandler());
    }
}