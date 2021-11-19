@java.lang.Override
public polyglot.ast.Node disambiguateOverride(polyglot.ast.Node parent, polyglot.visit.AmbiguityRemover ar) throws polyglot.types.SemanticException {
    polyglot.ast.Case c = node();
    polyglot.ast.Expr expr = c.expr();
    if (expr instanceof polyglot.ast.AmbExpr) {
        return c;
    }else {
        return null;
    }
}