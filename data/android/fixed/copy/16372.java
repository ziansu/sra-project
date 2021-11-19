public boolean isStmtReduct(ast.AssignStmt a) {
    java.lang.String leftname = a.getLHS().getVarName();
    java.util.Set<java.lang.String> rightnames = getExprNames(a.getRHS());
    return rightnames.contains(leftname);
}