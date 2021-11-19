@java.lang.Override
public void visit(org.teavm.javascript.ContinueStatement statement) {
    escaping |= !(outerStatements.contains(statement.getTarget()));
}