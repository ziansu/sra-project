public miniJava.ContextualAnalyzer.Type visitIxAssignStmt(miniJava.ContextualAnalyzer.IxAssignStmt stmt, java.lang.Object arg) {
    miniJava.ContextualAnalyzer.Type refRHS = stmt.val.visit(this, null);
    miniJava.ContextualAnalyzer.Type refLHS = stmt.ixRef.visit(this, null);
    return typeCheckAssignment(refLHS, refRHS);
}