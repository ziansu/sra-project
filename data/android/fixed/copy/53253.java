@java.lang.Override
public jkind.lustre.Type visit(jkind.lustre.UnaryExpr e) {
    switch (e.op) {
        case PRE :
        case NEGATIVE :
            return e.expr.accept(this);
        case NOT :
            return jkind.lustre.NamedType.BOOL;
        default :
            throw new java.lang.IllegalArgumentException();
    }
}