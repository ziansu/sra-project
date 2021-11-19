@java.lang.Override
protected void V(java.util.HashMap<java.lang.String, Syntax.Init> declarationMap, Syntax.Statement loopStatement) {
    innerV(declarationMap);
    statements.V(declarationMap, this);
    valid = true;
}