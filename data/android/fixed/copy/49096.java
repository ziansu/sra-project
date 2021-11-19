@java.lang.Override
public symjava.symbolic.Expr diff(symjava.symbolic.Expr expr) {
    return symjava.symbolic.Negate.simplifiedIns(symjava.symbolic.Sin.simplifiedIns(arg)).multiply(arg.diff(expr));
}