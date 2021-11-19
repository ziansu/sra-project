@java.lang.Override
public T visit(com.bamless.interpreter.ast.expression.PostIncrementOperation p, A arg) {
    p.getExpression().accept(this, arg);
    return null;
}