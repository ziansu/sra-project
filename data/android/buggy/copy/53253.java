@java.lang.Override
public jkind.lustre.Type visit(jkind.lustre.UnaryExpr e) {
    switch (e.op) {
        case NEGATIVE :
            return jkind.lustre.NamedType.INT;
        case NOT :
            return jkind.lustre.NamedType.BOOL;
        case PRE :
            return e.expr.accept(this);
        default :
            throw new java.lang.IllegalArgumentException();
    }
}