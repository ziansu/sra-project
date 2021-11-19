public org.grammaticalframework.pgf.Expr getAbstractSyntax(se.chalmers.phrasebook.backend.syntax.ChoiceContext choices) {
    org.grammaticalframework.pgf.Expr expr = org.grammaticalframework.pgf.Expr.readExpr(root.getAbstractSyntax(choices));
    choices.trim();
    return expr;
}